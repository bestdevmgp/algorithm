asc = [1, 2, 3, 4, 5, 6, 7, 8]
des = [8, 7, 6, 5, 4, 3, 2, 1]
l = list(map(int, input().split()))
if asc == l:
    print("ascending")
elif des == l:
    print("descending")
else:
    print("mixed")