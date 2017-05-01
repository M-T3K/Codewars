//Kata located at: https://www.codewars.com/kata/54da5a58ea159efa38000836

public class FindOdd {
	public static int findIt(int[] A) {
  	int n = 0;
    for(int num : A)  n ^= num;
    return n;
  }
}
