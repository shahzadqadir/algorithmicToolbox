# version 1, recursion not really working, works for small numbers
# but don't try with anything above 10

def fib(n):
    if n <= 1:
        return n
    return fib(n-1) + fib(n-2)

# version 2, recursion with memorization
# works with all cases

existing = {}

def fib2(n):
    if n not in existing:
        if n <= 1:
            existing[n] = n
        else:
            existing[n] = fib2(n-1) + fib2(n-2)
    return existing[n]

# version 3, without recursion

def fib3(n):
    existing = [None] * (n+1)
    existing[0], existing[1] = 0, 1
    for i in range(2, n+1):
        existing[i] = existing[i-1] + existing[i-2]
    return existing[n]

# version 4, without recursion and not wasting space

def fib4(n):
    previous, current = 0, 1
    for i in range(2, n+1):
        new_current = previous + current
        previous, current = current, new_current
    return current

print(fib4(150))
