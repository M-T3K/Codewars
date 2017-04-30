//Kata found at: https://www.codewars.com/kata/57d7805cec167081a50014ac

var spaghettiCode = function(plate) {
  
  var ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  var str = plate.toString().split(' ').join('').split(',').join('').split('_');
  var arr = [];
  for(var i = 0; i < 25; i++)  arr.push(0);
  for(var i = 0; i < str.length; i++)  {
  
    for(var j = 0; j < str[i].length; j++)  {
    
      arr[ABC.indexOf(str[i].charAt(j))]++;
    
    }
  
  }
  var l = 0;
  var s = 0;
  for(var i = 0; i < arr.length; i++)  {
  
    if(l < arr[i])  {
    
      l = arr[i];
      
      s = i;
    
    }
  
  }
  if(l == 0)  return "";
  return ABC.split('')[s];
}
