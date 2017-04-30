# Kata found at : https://www.codewars.com/kata/566be96bb3174e155300001b
def max_ball(v0):
    cv = 0.27777777777 * v0
    G = 9.81
    t = 10 * cv / G
    return int(t) + 1 if t - int(t) > 0.5 else int(t)
