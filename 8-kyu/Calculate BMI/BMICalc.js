//Kata found at: https://www.codewars.com/kata/57a429e253ba3381850000fb

function bmi(weight, height) {
  var a = weight / (height * height);
  if(a <= 18.5)  return "Underweight";
  else if(a <= 25.0)  return "Normal";
  else if(a <= 30.0)  return "Overweight";
  else  return "Obese";
}
