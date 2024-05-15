l = []
for i in range(10):
    n = int(input())
    data = n % 42
    l.append(data)
l.sort()
l = set(l)
print(len(l))