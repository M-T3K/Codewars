// Kata can be found at: https://www.codewars.com/kata/55902c5eaa8069a5b4000083

function formatMoney(amount){
  // your formatting code here
  console.log(amount);
  var strVal = "" +  amount;
  if(strVal.indexOf(".") == -1)  strVal += ".00";
  if(strVal.substring(strVal.indexOf(".") + 1).length == 1)  strVal += "0";
  
  return "$" + strVal;
}
