inputStr="Tact Coa"

def palindromPermutations(str):
    strSet=set(str)
    oddCount=0
    dict={}
    for s in strSet:
        if s!=' ':
            count=str.count(s)
            dict[s]=count
            if(count%2!=0):
                oddCount=oddCount+1
            if oddCount>1:
                return False
    return True

print(palindromPermutations(inputStr.lower()))