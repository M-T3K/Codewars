// Kata can be found at: https://www.codewars.com/kata/5865a75da5f19147370000c7

function addArrays(array1, array2) {

  if(array1.length != array2.length) throw "Error: Improper Array Length Input";
  for( var i = 0; i < array1.length; i++)  array1[i] += array2[i];
  return array1;

}
