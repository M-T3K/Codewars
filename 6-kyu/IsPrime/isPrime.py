#Kata can be found at: https://www.codewars.com/kata/5262119038c0985a5b00029f
def is_prime(num):
    if num < 2:
        return False
    if num == 2 or num == 3:
        return True
    i = 2
    while i < num:
        if num % i == 0:
            return False
        i += 1
    return True
