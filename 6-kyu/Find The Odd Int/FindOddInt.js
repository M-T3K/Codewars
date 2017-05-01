// Kata can be found at: https://www.codewars.com/kata/54da5a58ea159efa38000836

function findOdd(A) {
  var n = 0;
  for(var i = 0; i < A.length; i++)  n ^= A[i];
  return n;
}
