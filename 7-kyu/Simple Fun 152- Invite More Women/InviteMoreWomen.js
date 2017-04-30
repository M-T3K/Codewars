// Kata can be found at: https://www.codewars.com/kata/58acfe4ae0201e1708000075

function inviteMoreWomen(L) {
  
  var m = 0, w = 0;
  
  for(var i = 0; i < L.length; i++)  {
  
    if(L[i] == -1)  m++ 
    if(L[i] == 1) w++;
  
  }
  
  return m < w;
  
}
