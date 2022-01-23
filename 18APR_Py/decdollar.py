from decimal import *

c = setcontext(Context(prec=2))
x = Decimal("2000.220")
print("${:,.2f}".format(x))
x = Decimal("0.0556")
print("${:,.2f}".format(x))
x = Decimal("2999999.9")
print("${:,.2f}".format(x))
