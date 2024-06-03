n = int(input())
l = []
for i in range(n):
    num = int(input())
    l.append(num)
l.sort()
for i in range(len(l)):
    print(l[i])