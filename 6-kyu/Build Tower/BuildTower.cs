//Kata located at: https://www.codewars.com/kata/576757b1df89ecf5bd00073b

public class Kata
{
  public static string[] TowerBuilder(int nFloors)
  {
      string[] tow = new string[nFloors];
    
      int n = 0;
      for(int i = 0; i < nFloors; i++)  {
      
        string str = "";
        for(int j = 0; j <= n; j++)  {
        
          str += "*";
        
        }
        tow[i] = str;
        n += 2;
      
      }
      
      for(int i = 0; i < nFloors - 1; i++)  {
      
        n -= 2;
        int a = n / 2;
        string s = "";
        for(int j = 0; j < a; j++)  {
        
          s += " ";
        
        }
        tow[i] = s + tow[i] + s;
      
      }
      
      return tow;
  }
}
