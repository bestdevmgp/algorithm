n, m = map(int, input().split())
l = [0 for _ in range(n)]
z = 0
for x in range(m):
    i, j, k = map(int, input().split())
    l[i-1:j] = [k for _ in range(i-1, j)]
for y in range(n):
    print(l[y], end=" ")