l = [-1 for i in range(26)]
s = input()
for i in range(len(s)):
    if l[ord(s[i])-97] != -1:
        continue
    else: 
        l[ord(s[i])-97] = i

for i in range(26):
    print(l[i], end=" ")