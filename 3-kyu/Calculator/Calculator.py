# Kata can be found at: https://www.codewars.com/kata/5235c913397cbf2508000048

class Calculator(object):
  def evaluate(self, string):
    #Will replace all spaces with nothing, no n such that n > 9 OR n < 0
    stack = []
    expr_ini = 0
    OPERATOR = '+'
    i = 0
    while i < len(string):
        if string[i] == ' ':
            i += 1
        elif string[i].isdigit():
            expr_ini = i
            expr_end = i
            while expr_end < len(string) and (string[expr_end].isdigit() or string[expr_end] == '.'):
                expr_end += 1
            temp = float(string[expr_ini : expr_end])
            if OPERATOR == '+':
                stack.append(temp)
            elif OPERATOR == '-':
                stack.append(-1 * temp)
            elif OPERATOR == '*':
                prev = stack.pop()
                stack.append(prev * temp)
            else:
                prev = stack.pop()
                stack.append(prev / temp)
            i = expr_end + 1
        else:
            OPERATOR = string[i]
            i += 1
    return round(sum(stack), 3)
