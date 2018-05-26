s = "{'value': ['C:\\Users\\Chris\\Desktop\\Folder\\Folder\\File']}"
s = s.lstrip("{'value': [").rstrip("']}")
print(s)
