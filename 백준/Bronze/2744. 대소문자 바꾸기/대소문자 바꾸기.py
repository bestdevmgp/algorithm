s = input()
for i in range(len(s)):
    if ord(s[i])>=97 and ord(s[i])<=122:
        print(chr(ord(s[i])-32), end='')
    elif ord(s[i])>=65 and ord(s[i])<=90:
        print(chr(ord(s[i])+32), end='')