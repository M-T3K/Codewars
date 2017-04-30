# Kata can be found at: https://www.codewars.com/kata/58cb43f4256836ed95000f97

import math
def find_difference(a, b):
    return math.fabs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2])
