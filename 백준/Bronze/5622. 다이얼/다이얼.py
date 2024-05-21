l = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
time = 0
s = (input())
for i in range(len(s)):
    for j in range(len(l)):
        if s[i] in l[j]:
            time+=j+3
print(time)