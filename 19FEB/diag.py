from math import *

def cosang(a:float, b:float, c:float):
    return (a-b)/(2*c)

def diag(a:float, b:float, c:float):
    return sqrt(c*c + a*b)

def verfdiag(p:float, q:float, r:float = 2):
    a, b, c = verflen(p), verflen(q), verflen(2*r)
    d = c*c + a*b
    if (d >= 4):
        return str(d) + "i"
    return verfside(sqrt(d))

def verflen(s:float):
    return 2*cos(pi/s)

def verfside(a:float):
    return pi/acos(a/2)
