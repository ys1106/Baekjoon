word = input().upper()
num = [0 for i in range(26)]
max = 0
max_index = 0
count = 0

for i in range(len(word)):
    num[ord(word[i])-65] += 1

for i in range(26):
    if num[i] > max:
        max = num[i]
        max_index = i
        if count == 1:
            count = 0
    elif num[i] == max:
        count = 1

if count == 1:
    print('?')
else:
    print(chr(max_index+65))

# max = 0
# max_word = ''
#
# for i in range(len(word)):
#     index = ord(word[i])-65
#     num[index] += 1
#     if num[index] > max:
#         max = num[index]
#         max_word = word[i]
#         count = 0
#     elif num[index] == max:
#         count += 1
#
# if count == 1:
#     print('?')
# else:
#     print(max_word)



