# Kata located at: https://www.codewars.com/kata/56606694ec01347ce800001b

def is_triangle(a, b, c):

    if a + b > c and a + c > b and b + c > a : 
        return True
    return False
    
