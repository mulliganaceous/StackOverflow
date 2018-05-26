my_dicts = [
    { 'key1' : 'value1',
      'key2' : 'value2' },

    { 'key1' : 'value1',
      'key2' : 'value2',
      'key3' : 'value2'  }, # dup added for testing

    { 'key1' : 'value1',
      'key2' : 'value2' }]

def replace_all_values(my_dicts: list, str_from: str, str_to: str):
    # Iterate over each member of the list of dictionaries
    for dictionary in my_dicts:
        # Members 'in' a dictionary are their keys.
        # Change the corresponding dictionary value if applicable
        for key in dictionary:
            if (dictionary[key] == str_from):
                dictionary[key] = str_to

replace_all_values(my_dicts, 'test', 'done')
