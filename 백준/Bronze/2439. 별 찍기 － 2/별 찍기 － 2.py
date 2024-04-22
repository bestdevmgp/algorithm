n = int(input())
sum = n
for i in range(1, n+1):
    sum-=1
    print(" "*sum + "*"*i)