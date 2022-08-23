from email import iterators


def calc_gcd(num1, num2):
    interations = num1
    if num2 > num1:
        interations = num2
    best = 0
    for i in range(1, interations):
        if num1 % i == 0 and num2 % i == 0:
            best = i
    return best


print(f"GCD for 357 & 234 is: {calc_gcd(357, 234)}")