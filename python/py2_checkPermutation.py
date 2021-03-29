inputstr="god"
pString="doG"

# Check Permutation: Given two strings, write a method to decide if one is a permutation of the
# other.


def checkPermutation(string, pstring):
    if(sorted(string.lower()).__eq__(sorted(pstring.lower()))):
        return True
    return False

print(checkPermutation(inputstr,pString))