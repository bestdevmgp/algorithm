h, m = map(int, input().split())
add = int(input())
time = h*60+m+add
if time >= 1440:
    time-=1440
print(time//60, time%60)