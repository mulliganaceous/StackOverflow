from datetime import datetime

dt = datetime(2018, 5, 21, 0, 0, 0, 100)
print(dt.isoformat(timespec='microseconds'))
print("%4d-%02d-%02d %02d:%02d:%02d:%04d"
      %(dt.year, dt.month, dt.day,
        dt.hour, dt.minute, dt.second, dt.microsecond // 100))
