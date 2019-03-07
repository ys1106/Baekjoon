word = input()
word2 = ''

for i in range(len(word)-1,-1,-1):
    word2 += word[i]

if(word==word2):
    print('true')
else:
    print('false')
