// Kata located at: https://www.codewars.com/kata/566be96bb3174e155300001b

class Ball
{
    public: static int maxBall(int v0)  {
    
    double cv = 0.277777777 * v0; // Converted from kmh^-1 -> ms^-1
    double G = 9.81; // Grav
    // Derivative = 0 -> t = cv / g
    double t = 10 * cv / G;
    return (t - (int)t > 0.5) ? (int)t + 1 : (int) t;
    
    }
};
