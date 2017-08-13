# Kata can be found at:https://www.codewars.com/kata/5235c913397cbf2508000048/

class Calculator(object):
    def evaluate(self, string):
        return round(eval(string), 12)
