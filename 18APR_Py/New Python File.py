s = ""
s = "{'value': ['C:\Users\Chris\Desktop\Folder\Folder\File']}"
s = s.lstrip("{'value': ")
s = s.rstrip("']}")
print(s)
