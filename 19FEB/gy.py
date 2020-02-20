def widespace(sentence: str, word: str, start: int = None, end: int = None):
    if not start:
        start = 0
    if not end:
        end = len(sentence)
        
    spacedword = " ".join(word)
    indices = []
    cur = sentence.find(word, start)

    # Find all occurrences of the word
    while cur >= 0 and cur < end + len(word) - 1:
        # Add to list
        indices.append(cur)
        
        # Next occurrence
        cur = cur + len(word)
        cur = sentence.find(word, cur, end + len(word) - 1)
    print("\t" + str(indices))

    # Replace word with spaced-out word
    while len(indices) > 0:
        index = indices.pop()
        sa = sentence[:index]
        sb = sentence[index:index + len(word)]
        sc = sentence[index + len(word):]
        sb = sb.replace(word, spacedword)
        sentence = sa + sb + sc
        
    return sentence

s = widespace("Foo, Bar, Baz!", "Baz")
print(s)
s = widespace("Foo, Foo, Foo!", "Foo")
print(s)
s = widespace("Foo, Foo, Foo!", "Foo", start = 0, end = 2)
print(s)
s = widespace("Foo, Foo, Foo!", "Foo", start = 0, end = 5)
print(s)
s = widespace("Foo, Foo, Foo!", "Foo", start = 0, end = 6)
print(s)
s = widespace("Mulliganaceous Mulligans", "Mulligan")
print(s)
