word = input()
l1 = []
l2 = []
for i in range(len(word)):
    l1.append(word[i])
for i in range(len(word)-1, -1, -1):
    l2.append(word[i])
if l1==l2:
    print("1")
elif l1!=l2:
    print("0")