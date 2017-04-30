#Kata found at: https://www.codewars.com/kata/520b9d2ad5c005041100000f

def pig_it(text):
    arr = []
    temp = 0
    i = 0
    while i < len(text):
        if text[i] == " ":
            arr.append(text[temp:i])
            temp = i + 1
        if i == len(text) - 1:
            arr.append(text[temp:i + 1])
        i = i + 1
    print(arr)
    i = 0
    while i < len(arr):
                
        arr[i] = piggify(arr[i])
        i = i + 1
    str = ""
    i = 0
    for s in arr:
        print(s)
        str = str + s
    print(str)
    return str[1:]

#This here will Piggify
def piggify(word):
    if not word.isalpha():
        return " " + word
    return " " + word[1:] + word[0] + "ay"
    
