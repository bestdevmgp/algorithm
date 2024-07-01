k = int(input())
l = []
for i in range(k):
    n = int(input())
    if n != 0:
        l.append(n)
    elif n == 0:
        del l[-1]
sums = sum(l)
print(sums)