// Kata located at: https://www.codewars.com/kata/5648b12ce68d9daa6b000099

using System;
using System.Collections.Generic;

public class Kata
    {
        public static int Number(List<int[]> peopleListInOut)
        {
          int count = 0;
          foreach(int[] arr in peopleListInOut)  count += arr[0] - arr[1];
          
          return count;
        }
    }
