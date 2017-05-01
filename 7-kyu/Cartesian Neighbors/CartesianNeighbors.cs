//Kata found at: https://www.codewars.com/kata/58989a079c70093f3e00008d

using System;
using System.Collections.Generic;

public class Kata {
    public static IEnumerable<int[]> cartesianNeighbor(int x, int y){
        
        return new int[][] {
                        new int[2]  {x - 1, y - 1}, new int[2]  {x - 1, y}, new int[2]  {x - 1, y + 1},
                        new int[2]  {x, y - 1}, new int[2]  {x, y + 1},
                        new int[2]  {x + 1, y - 1}, new int[2]  {x + 1, y}, new int[2]  {x + 1, y + 1}
                        };
        
    }
}
