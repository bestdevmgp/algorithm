n = int(input())
l = []
for _ in range(n):
    a = int(input())
    if (a != 0):
        l.append(a)
    else:
        if l:
            l.pop()
print(sum(l))