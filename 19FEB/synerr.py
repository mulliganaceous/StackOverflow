if option=='C':
    radius = float(raw_input("Please enter your radius"))
    area = 3.14159 * radius**2
    print "The area is for a circle with radius of %s is %s." % (radius,area)
elif option =='T':
    base = float(raw_input("Enter the base"))
    height = float(raw_input("Enter the height"))
    area = 1/2* base * height
    print "The area of the triangle with base of %s is %s" % (base, area)
else:
    print "Wrong thing"
