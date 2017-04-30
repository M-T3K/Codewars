// Kata located at: https://www.codewars.com/kata/566be96bb3174e155300001b

public class Ball {

    public static int maxBall(int v0) {
        
        double cv = v0 * 0.277777777;
        final double G = 9.81;
        double t = 10 * cv / G;
        return (t - (int) t > 0.5) ? (int)t + 1 : (int)t;
        
    }
}
