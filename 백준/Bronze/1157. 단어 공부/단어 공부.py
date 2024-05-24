word = input().upper()
l = [0 for _ in range(26)]
for i in word:
    l[ord(i)-65] += 1
    
if len(word) == 1:
    print(word)
elif (sorted(l)[-1] == sorted(l)[-2]):
    print("?")
else:
    print(chr((l.index(max(l))+65)))