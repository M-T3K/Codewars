// Kata located at: https://www.codewars.com/kata/566be96bb3174e155300001b
int maxBall(int v0) {
    double cv = 0.2777777777 * v0;
    double G = 9.81;
    double t = 10 * cv / G;
    return (t - (int)t > 0.5) ? (int)t + 1 : (int)t;
}
