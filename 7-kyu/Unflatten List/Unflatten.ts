// https://www.codewars.com/kata/unflatten-a-list-easy/

export function unflatten (flatArray:any[]):any[] {

    let arr: any[] = []; // Initialize an Empty String
    for(let i: number = 0; i < flatArray.length; ++i) {

        let x: number = flatArray[i];
        if(x < 3) {

            arr.push(x);
        }
        else {
            let subArr: any[] = flatArray.slice(i, i + x); 
            arr.push(subArr);
            i += subArr.length - 1;
        }
        
    };

    return arr;
}

let input = [ 1, 4, 5, 2, 1, 2, 4, 5, 2, 6, 2, 3, 3 ];
let expected = [1, [4,5,2,1], 2, [4,5,2,6], 2, [3, 3] ];

console.log(`${unflatten(input)} -> ${expected}`);