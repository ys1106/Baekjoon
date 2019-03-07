string = input()
length = len(string)
check = [0] * 26

for i in range(0, length):
    for j in range(97, 123):
        if ord(string[i]) == j:
            check[j - 97] += 1

for i in range(26):
    print(check[i], end=' ')
