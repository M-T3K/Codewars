// Kata can be found at: https://www.codewars.com/kata/5904d222e1bfd3354e000026
function removeDuplication(arr){
  var ar = [];
  
  for(var i = 0; i < arr.length; i++)  {
    var add = true;
    for (var j = 0; j < arr.length; j++)  {
    
      if(arr[i] == arr[j] && i != j)  {
        add = false;
        break;
      }
      
    }
    if (add == true && arr[i] !== undefined)  ar.push(arr[i]);
  
  }
  
  return ar;
}
