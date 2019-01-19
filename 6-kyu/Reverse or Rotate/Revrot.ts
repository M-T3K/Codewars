// https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991

export class G964 {
    public static revrot(str: string, sz: number) {
        
        // Empty Check
        if((sz <= 0) || (sz > str.length) || (str === "")) {

            return "";
        }

        let res: string = "";
        for(let i: number = 0; i + sz <= str.length; i += sz) {

            
            let substr: string = str.substr(i, sz); // Fml this was meant to be sz and not i + sz. There go 45 minutes of my life lmao.
            let sum_cubes: number = substr.split('').map((x) => Number(x)).reduce((s, x) => s += Math.pow(x, 3), 0);
            if(sum_cubes % 2 === 0) {
                
                substr = substr.split('').reverse().join('');
            }
            else {

                // We need to shift to the left the chunk but we must move the left most element to the right
                let arr: string[] = substr.split('');
                let first: string = arr.shift();
                substr = arr.join('') + first ;
            }

            res += substr;
        }

        return res;
    }
}

console.log(`234561876549>123456987654 -> ${G964.revrot("123456987654", 6)}\n`);
console.log(`234561356789>123456987653 -> ${G964.revrot("123456987653", 6)}\n`);
console.log(`44668753>66443875 -> ${G964.revrot("66443875", 4)}\n`);
console.log(`64438756>66443875 -> ${G964.revrot("66443875", 8)}\n`);
console.log(`67834466>66443875 -> ${G964.revrot("664438769", 8)}\n`);
console.log(`23456771>123456779 -> ${G964.revrot("123456779", 8)}\n`);
console.log(`330479108928157>733049910872815764 -> ${G964.revrot("733049910872815764", 5)}\n`);

// Alternative Solution by Vingot
function revrot(str, sz) {
    if (sz <= 0 || str == "" || sz > str.length) return "";
    let chunk = str.slice(0, sz).split('');
    const divisibleBy2 = chunk.reduce((a, b) => { return a + Math.pow(parseInt(b), 3) }, 0) % 2 == 0;
    divisibleBy2 ? chunk = chunk.reverse() : chunk.push(chunk.shift());
    return chunk.join('') + revrot(str.slice(sz, str.length), sz);
}