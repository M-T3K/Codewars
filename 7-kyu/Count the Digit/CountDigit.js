// Kata located at: https://www.codewars.com/kata/566fc12495810954b1000030

function nbDig(n, d) {
    // your code
    var miam = "";
    var c = 0;
    for(var i = 0; i <= n; i++)  {
    
      miam += "" + i*i;
    
    }
    
    for(var i = 0; i < miam.length; i++)  {
      
      if(miam.charAt(i) == d)  c++;
    
    }
    
    return c;
    
}
