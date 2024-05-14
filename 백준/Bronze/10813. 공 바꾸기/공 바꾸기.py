import sys
if __name__ == '__main__':
    a, b = map(int, sys.stdin.readline().strip().split())
    arr = list(range(1, a + 1))
    for i in range(b):
        t_1, t_2 = map(int, sys.stdin.readline().strip().split())
        temp = arr[t_1 - 1]
        arr[t_1 - 1] = arr[t_2 - 1]
        arr[t_2 - 1] = temp

    for i in arr:
        print(i, end=' ')