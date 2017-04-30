#Kata found at: https://www.codewars.com/kata/58841cb52a077503c4000015
def circle_of_numbers(n, fst):
    c = int(n / 2)
    return fst + c if c > fst else fst - c
        
    
