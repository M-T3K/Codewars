// Kata found at: https://www.codewars.com/kata/58934ea69227a79d0000000b

import math

def solver(a, b, c):
    res = []
    d = b*b - 4*a*c
    if d < 0:
        return res
    res.append(float("{0:.2f}".format((-1 * b + math.sqrt(d)) / (2 * a))))
    res.append(float("{0:.2f}".format((-1 * b - math.sqrt(d)) / (2 * a))))
    if res[0] == res[1]:
        return [res[0]]
    return res
