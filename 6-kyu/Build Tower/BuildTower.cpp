// Kata found at: https://www.codewars.com/kata/576757b1df89ecf5bd00073b

class Kata
{
public:
    std::vector<std::string> towerBuilder(int nFloors)
    {
      std::vector<std::string> vec(nFloors);
      
      //Predetermine number spaces
      
      int n = 0;
      for(int i = 0; i < nFloors; i++)  {
      
        std::string str = "";
        for(int j = 0; j <= n; j++)  {
        
          str += "*";
        
        }
        vec[i] = str;
        n += 2;
      
      }
      
      for(int i = 0; i < nFloors - 1; i++)  {
      
        n -= 2;
        int a = int(n / 2);
        std::string s = "";
        for(int j = 0; j < a; j++)  {
        
          s += " ";
        
        }
        vec[i] = s + vec[i] + s;
      
      }
      
      return vec;
      
    }
    
};
