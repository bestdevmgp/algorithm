whole = int(input())
count = int(input())
cost = 0
buy = 0
sum = 0
for i in range(count):
    cost, buy = map(int, input().split())
    sum += cost * buy
if sum == whole:
    print("Yes")
else:
    print("No")