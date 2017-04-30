#Kata can be found at: https://www.codewars.com/kata/554b4ac871d6813a03000035
def high_and_low(numbers):
    # GOT IT ITS THE BIGGEST OF NEGATIVES AND BIGGEST OF POSITIVES
    # THEN PUT WHICHEVER ONE IS BIGGER UP IN FRONT
    l = [int(str) for str in numbers.split(' ')]
    l = sorted(l)
    return str(l[len(l) - 1])  + ' ' + str(l[0])
