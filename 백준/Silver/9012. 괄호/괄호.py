T = int(input())
for _ in range(T):
    s = input().strip()
    top = 0
    is_valid = True
    for char in s:
        if char == '(':
            top += 1
        elif char == ')':
            top -= 1
        if top < 0:
            is_valid = False
            break
    print("YES" if is_valid and top == 0 else "NO")