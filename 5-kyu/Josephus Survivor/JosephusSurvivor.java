// Kata located at: https://www.codewars.com/kata/555624b601231dc7a400017a

import java.util.ArrayList;

public class JosephusSurvivor {
  public static int josephusSurvivor(int n, int k) {
      
     ArrayList<Integer> people = new ArrayList<Integer>();
     
     for(int i = 0; i < n; i++)  {
     
         people.add(i);
     
     }
     
     int kill = 0;
     k--;
     
     while(people.size() > 1)  {
     
         kill = (kill + k) % people.size();
         people.remove(kill);
     
     }
     
     return people.get(0) + 1;
      
  }  
}
