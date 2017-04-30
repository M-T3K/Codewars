# Kata found at: https://www.codewars.com/kata/514b92a657cdc65150000006

def solution(number):
    count = 0
    for i in range(1, number):
        if i % 3 == 0 or i % 5 == 0:
            count = count + i
    return count
  
