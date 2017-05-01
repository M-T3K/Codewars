# Kata located at: https://www.codewars.com/kata/54da5a58ea159efa38000836
def find_it(seq):
      n = 0
      for num in seq:
          n = n ^ num;
      return n
