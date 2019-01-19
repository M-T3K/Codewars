export function generateShape(n: number): string {

    let str: string = "";
    for(let i: number = 0; i < n; ++i) {

        for(let j: number = 0; j < n; ++j) {
            str += "+";
        }
        if(i !== (n - 1)) {str += "\n";}
    }
    return str;
}

console.log(generateShape(5));