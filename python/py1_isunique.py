inputstr="abca"

# Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
# cannot use additional data structures?

def isUnique(str):
    if(len(str)!=len(set(str))):
        return False
    else:
        return True

bool=isUnique(inputstr)
print(bool)