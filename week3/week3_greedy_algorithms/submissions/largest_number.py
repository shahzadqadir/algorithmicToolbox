#Uses python3
import sys

def greater_or_equal(num1, num2):
    num1 = str(num1)
    num2 = str(num2)
    if len(num1) <= len(num2):
        for i in range(len(num1)):
            if num1[i] < num2[i]:
                return num2
            elif num1[i] > num2[i]:
                return num1
        if num2[len(num2)-1] < num1[0]:
            return num1
        return num2
    else:
        for i in range(len(num2)):
            if num2[i] < num1[i]:
                return num1
            elif num2[i] > num1[i]:
                return num2
        if num1[len(num1)-1] < num2[0]:
            return num2
        return num1

def largest_number(a):
    #write your code here
    res = ""
    list_length = len(a)
    for i in range(list_length):
        max = a[0]
        for num in a:
            max = greater_or_equal(max, num)
        if int(res + max) >= int(max + res):
            res += max
        else:
            res = max + res
        a.remove(max)
    return res

if __name__ == '__main__':
    input = sys.stdin.read()
    data = input.split()
    a = data[1:]
    print(largest_number(a))
