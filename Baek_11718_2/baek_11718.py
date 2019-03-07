# import sys
#
# while True:
#     word = sys.stdin.readline()
#     if word == '':
#         break
#     print(word)



# words = []
while True:
    try:
        word = input()
        print(word)
    except EOFError:
        break

# while True:
#     word = input()
#     print(word)

# for i in range(len(words)):
#     print(words[i])





#
# words = []
# while True:
#     try:
#         word = input()
#     except EOFError:
#         break
#     words.append(word)
#     print(word)
#
# for i in range(len(words)):
#     print(words[i])