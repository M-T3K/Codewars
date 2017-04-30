// Kata located at: https://www.codewars.com/kata/576757b1df89ecf5bd00073b

function towerBuilder(nFloors) {

     tow = [nFloors];
    
      var n = 0;
      for(var i = 0; i < nFloors; i++)  {
      
        var str = "";
        for(var j = 0; j <= n; j++)  {
        
          str += "*";
        
        }
        tow[i] = str;
        n += 2;
      
      }
      
      for(var i = 0; i < nFloors - 1; i++)  {
      
        n -= 2;
        var a = n / 2;
        var s = "";
        for(var j = 0; j < a; j++)  {
        
          s += " ";
        
        }
        tow[i] = s + tow[i] + s;
      
      }
      
      return tow;
}
