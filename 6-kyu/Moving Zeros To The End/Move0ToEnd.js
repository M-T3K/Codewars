// Kata can be found at: https://www.codewars.com/kata/52597aa56021e91c93000cb0

var moveZeros = function (arr) {
  
  var a = [];
  
  for(var i = 0; i < arr.length; i++)  {
  
    if(arr[i] !== 0)  {a.push(arr[i]);}
  
  }
  for(var i = 0; i < arr.length; i++)  {
    if(arr[i] === 0)  {a.push(arr[i]);}
  
  }
  
  return a;
  
  
}
