N, K = map(int, input().split())
coins = [int(input().strip()) for _ in range(N)]

count = 0

for coin in reversed(coins):
    if K == 0:
        break
    if coin <= K:
        count += K // coin
        K %= coin

print(count)