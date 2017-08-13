# Kata can be found at: https://www.codewars.com/kata/53d40c1e2f13e331fc000c26

# Okay by handle negatives, what the Kata is tring to say is to actually do the fibo for n < 0
def fib(num):
    if num < 0:
        return -1 * fibo(-1 * num)[0] if num % 2 == 0 else fibo(-1 * num)[0]
    else:
        return fibo(num)[0]

def fibo(n):
    if n == 0:
        return (0, 1)
    if n == 1:
        return (1, 1)
    a, b = fibo(n // 2)
    x = a * (2 * b - a)
    y = b * b + a * a
    return (x, y) if n % 2 == 0 else (y, x + y)
