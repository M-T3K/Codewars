# Kata found at: https://www.codewars.com/kata/58ca658cc0d6401f2700045f

def find_multiples(integer, limit):
    # Your code here!
    arr = []
    count = integer
    while count <= limit:        
        arr.append(count)
        count = count + integer
    return arr
