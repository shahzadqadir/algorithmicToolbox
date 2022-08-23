import sys

def fibnocci(number):
    numbers = [0 for i in range(number+1)]
    if number > 1:
        numbers[0] = 0
        numbers[1] = 1
        for j in range(2, number+1):
            numbers[j] = numbers[j-1] + numbers[j-2]
        return numbers[number]
    return number

def gcn(number1, number2):
    a, b = number1, number2

    while number1 % number2 != 0:
        c = b
        b = a % b
        a = c
        return b


print(f"Fiboncci number for {int(sys.argv[1])} is: {fibnocci(int(sys.argv[1]))}")
print(f"GCN of 10, 4 is: {gcn(10, 4)}" )


