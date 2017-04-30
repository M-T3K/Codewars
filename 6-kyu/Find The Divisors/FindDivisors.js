// Kata can be found at: https://www.codewars.com/kata/544aed4c4a30184e960010f4

function divisors(integer) {
  
  var arr = [];
  
  for(var i = 2; i < integer; i++)  {
  
    if(integer % i == 0)  arr.push(i);
    
  }
  
  return arr.length == 0 ? integer + " is prime" : arr;
  
};
