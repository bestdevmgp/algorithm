N = int(input())

result = 0
for i in range(1, N + 1):
    s = i + sum(map(int, str(i)))
    if s == N:
        result = i
        break

print(result)