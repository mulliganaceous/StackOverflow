def fibonacci(n: int):
    if n <= 1:
        return n
    a, b = 0, 1
    for k in range(2,n+1):
        a, b = b, a + b
    return b
