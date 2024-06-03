n = int(input())
score = 1
scoreSum = 0
for i in range(n):
    answer = input()
    for j in range(len(answer)):
        if answer[j] == "O":
            scoreSum += score
            score += 1
        elif answer[j] == "X":
            score = 1
    print(scoreSum)
    score = 1
    scoreSum = 0