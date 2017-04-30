# Kata can be found at: https://www.codewars.com/kata/544aed4c4a30184e960010f4

def divisors(integer):
    
    list = [];
    i = 2;
    while i < integer:
        if integer % i == 0:
            list.append(i)
        i = i + 1

    if not list:
        return str(integer) + ' is prime'
    return list
