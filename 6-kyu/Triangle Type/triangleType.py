# Kata can be found at: https://www.codewars.com/kata/53907ac3cd51b69f790006c5

def triangle_type(a, b, c):
  
  if a > b and a > c:
      temp = c
      c = a
      a = temp
  if b > c and b > a:
      temp = c
      c = b
      b = temp
      
  if not a + b > c or not a + c > b or not b + c > a:
      return 0
  if (c * c == a * a + b * b) and (c * c > 0):
      return 2
  if (c * c < a * a + b * b) and c * c > 0:
      return 1
  if (c * c > a * a + b * b) and (a * a + b * b > 0):
      return 3
  else:
      return 0
