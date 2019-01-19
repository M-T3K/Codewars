// https://www.codewars.com/kata/5552101f47fc5178b1000050
const digPow = (n, p) => {
    
        let list = n.toString().split('').map((num) => Math.pow(num, p++));
        
        let sum = 0;
        list.forEach((num) => sum += num);
        
        return (sum % n === 0)? sum / n : -1;
}

// Alternative using reduce
const digPow2 = (n, p) => {

    let x = String(n).split('').reduce((s, elem, i) => s + Math.pow(elem, p + i), 0);
    
    // toString is unnecessary.
    // reduce(s: accumulator, elem: current Value, i: index)
    // The 0 at the end represents the initial value
    return x % n ? -1 : x / n;
}

console.log(`${digPow2(695, 2)}`);