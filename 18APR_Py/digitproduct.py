def mul_root(n: int):
    if n < 10:
        return n

    digit_product = 1
    while n > 10:
        digit_product *= (n % 10)
        n //= 10
    digit_product *= (n % 10)
    
    return mul_root(digit_product)
