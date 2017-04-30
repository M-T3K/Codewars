// Kata found at: https://www.codewars.com/kata/525a3d6b85a9a47fcf00055a

function calculateHypotenuse(a,b){
  
    if (isNaN(a) || !(typeof(a) == "number")  || a < 0 || isNaN(b) || !(typeof(b) == "number") || b < 0)  {throw "Invalid";}
    
    return Math.round(Math.sqrt(a * a + b * b) * 1000) / 1000;
  
}
