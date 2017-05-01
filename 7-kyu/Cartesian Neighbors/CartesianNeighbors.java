//Kata found at: https://www.codewars.com/kata/58989a079c70093f3e00008d

public class Kata {
    public static int[][] cartesianNeighbor(int x, int y){        
        return new int[][] {
                       {x - 1, y - 1},{x - 1, y},{x - 1, y + 1},
                       {x, y - 1},{x, y + 1},
                        {x + 1, y - 1},{x + 1, y}, {x + 1, y + 1}
                        };
    }
}
