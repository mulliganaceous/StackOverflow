def format_digitstring(string:str):
    if len(string) != 9:
        return None
    return string[0:3] + "-" + string[3:6] + "-" + string[6:9]


s1 = "024764108"
s2 = "002231531"
s3 = "005231329"
s4 = "00112341"

print(format_digitstring(s1))
print(format_digitstring(s2))
print(format_digitstring(s3))
print(format_digitstring(s4))
