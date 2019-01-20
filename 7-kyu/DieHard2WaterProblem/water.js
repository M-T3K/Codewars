// https://www.codewars.com/kata/3-litres-and-5-litres/

// Diophantine equation

const canIMeasure = (a, b, c) => {

    let small = a;
    let big = 0;
    while(big !== c) {

        big = big + small; // We pour the contents of the small jug to the big jug
        small = a;  // We refill the small jug
        if(big >= b) { // If there is overflow on the jug, we pour the contents away
                            // and keep the leftover in the small jug;
            small = big % b;
            big = 0;
        }
        if(small === 0 && big === 0) {
            return false;
        }
    }
    return true;

}



// Alternative Solution


const gcd = (a,b) => b? gcd(b, a%b) : a;
const canIMeasure2 = (a, b, c) => {
    
    if(b < c) {
        return false; // c > b > a => Therefore cant happen
    }
    
    if(c % gcd(a, b) === 0) {
        return true;    // Found solution to diophantine equation
    
    }
    return false;
};
function canIMeasure2(a, b, c) {
  if(c > b)return false;
  if (c % gcd(a, b) == 0) return true;
  return false;
}

console.log(`${canIMeasure(3, 5, 4)}==true`);
console.log(`${canIMeasure(5, 8, 3)}==true`);
console.log(`${canIMeasure(6, 10, 5)}==false`);
console.log(`${canIMeasure(10, 20, 15)}==false`);
