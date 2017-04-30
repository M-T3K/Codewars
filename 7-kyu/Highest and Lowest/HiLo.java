//Kata can be found at https://www.codewars.com/kata/554b4ac871d6813a03000035

import java.util.Arrays;

public class Kata {
  public static String HighAndLow(String numbers) {
    
    System.out.println(numbers);
    String[] ar = numbers.split(" ");
    int[] ns = new int[ar.length];
    for(int i = 0; i < ar.length; i++)  {
    
      ns[i] = Integer.parseInt(ar[i]);
    
    }
    Arrays.sort(ns);
    
    return ns[ns.length - 1] + " " + ns[0];
  }
}
