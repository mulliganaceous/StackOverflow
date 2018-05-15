import datetime, pytz

datetime.datetime(2018, 1, 25, 16, 26, tzinfo=pytz.timezone('US/Eastern')).hour
datetime.datetime(2018, 1, 25, 16, 26, tzinfo=pytz.timezone('US/Eastern')).astimezone(pytz.utc).hour
datetime.datetime(2018, 4, 25, 16, 26, tzinfo=pytz.timezone('US/Eastern')).hour
datetime.datetime(2018, 4, 25, 16, 26, tzinfo=pytz.timezone('US/Eastern')).astimezone(pytz.utc).hour
