//Kata located at: https://www.codewars.com/kata/52654ea8e218b83553000666

function toBinaryString(number){
  
  if (number == 0)	return "0";
  var str = "";
  
  while(number > 0)	{
  
  	str += number % 2;
    number = parseInt(number / 2);
  
  }
  
  return str.split("").reverse().join("");
  
}
