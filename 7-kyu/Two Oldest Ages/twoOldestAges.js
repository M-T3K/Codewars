// Kata can be found at: https://www.codewars.com/kata/511f11d355fe575d2c000001


function twoOldestAges(ages){

  var a = 0;
  var b = 0;
  
  for(var i = 0; i < ages.length; i++)  {
  
    if(ages[i] > b)  {
    
      a = b; 
      b = ages[i];
    
    }  else if(ages[i] > a)  {
    
      a = ages[i];
    
    }
  
  }
  var arr = [2];
  arr[0] = a;
  arr[1] = b;
  return arr;

}
