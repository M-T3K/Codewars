//Kata can be found at: https://www.codewars.com/kata/51b6249c4612257ac0000005

function solution(roman){
  
    var dic = {M: 1000, D: 500, C: 100, L: 50, X: 10, V: 5, I: 1};
    var romanNumbers = roman.split('');
    var val = 0;
    
    for(let i = 0; i < romanNumbers.length; ++i)  {
    
      if(dic[romanNumbers[i]] < dic[romanNumbers[i + 1]])  {
      
        val += dic[romanNumbers[i + 1]] - dic[romanNumbers[i]];
        ++i;
      
      }  else  {
      
        val += dic[romanNumbers[i]];
      
      }
    
    }
    
    return val;
  
}
