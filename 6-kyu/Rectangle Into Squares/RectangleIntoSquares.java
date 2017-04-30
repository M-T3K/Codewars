// Kata can be found at: https://www.codewars.com/kata/55466989aeecab5aac00003e

import java.util.List;
import java.util.ArrayList;

public class SqInRect {
	
  public static boolean FIRST = true;
  //May I Kill myself?
  //The funny thing is that this solution does not always work
  // 50% of the time it misses 1 of the tests. 
  
	public static List<Integer> sqInRect(int lng, int wdth) {
		
    System.out.println("Length: " + lng + " | Width: " + wdth);
    List<Integer> list = new ArrayList<Integer>();
    System.out.println("First? " + FIRST);
    
    if(lng == wdth && FIRST)	{
    
      FIRST = false;
      return null;
    }
    else if(lng == wdth && !FIRST)  {
      
      FIRST = false;
    	list.add(lng);
    	return list;
    }
    else if(lng > wdth && lng - wdth > 0)  {
    
      FIRST = false;
      list = sqInRect(lng - wdth, wdth);
      list.add(wdth);
      
    }  else if(wdth > lng && wdth - lng > 0)  {
      
      FIRST = false;
      list = sqInRect(lng, wdth - lng);
      list.add(lng);
    
    }
    
    	List<Integer> l2 = new ArrayList<Integer>();
    	list.sort(null);
    	for(int i = list.size() - 1; i > -1; i--)		l2.add(list.get(i));
      
    FIRST = true;
		return l2;
    
	}
}
