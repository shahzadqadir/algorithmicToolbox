#!/usr/bin/env python3

import sys

def fibonacci(num):
	
	if num > 1:
		numbers = [0 for n in range(num+1)]
		numbers[0] = 0
		numbers[1] = 1
		for i in range (2, num+1):
			numbers[i] = numbers[i-1] + numbers[i-2]
		return numbers[num]
	return num;

print(f"20th Fibonacci is: {fibonacci(int(sys.argv[1]))}")
