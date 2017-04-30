// Kata found at: https://www.codewars.com/kata/514b92a657cdc65150000006

function solution(number){
  
  var count = 0;
  for(var i = 3; i < number; i++)  {
  
    if(i % 3 == 0 || i % 5 == 0)  {count += i;}
  
  }
  return count;
  
}
