words = []
while True:
    word = input()
    if word == 'END':
        break
    words.append(word)

for i in range(len(words)):
    for j in range(len(words[i])-1, -1, -1):
        print(words[i][j], end='')
    print()

