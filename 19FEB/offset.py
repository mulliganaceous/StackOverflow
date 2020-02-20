import datetime

date_now = datetime.datetime.now()
print(date_now)
date_now_with_offset = date_now.astimezone()
print(date_now_with_offset)
