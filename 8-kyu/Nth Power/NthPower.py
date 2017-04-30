#Kata located at: https://www.codewars.com/kata/57d814e4950d8489720008db

import math
def index(array, n):
    if n > len(array):
        return -1;
    
    return int(math.pow(array[n], n))
