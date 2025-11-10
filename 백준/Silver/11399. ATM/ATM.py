n = int(input())
nums = list(map(int, input().split()))
count = 0
nums.sort()
for i in range(n):
    for j in range(i+1):
        count += nums[j]
print(count)