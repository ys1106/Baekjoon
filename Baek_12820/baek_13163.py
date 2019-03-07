
nickname = []
N = int(input())

for i in range(N):
    name = input()
    nick = 'god'
    splits = name.split(' ')[1:]
    for split in splits:
        nick += split
    nickname.append(nick)

for n in nickname:
    print(n)

#
# for i in range():
#     nickname[i].split(' ')[0] = 'god'
#
# for i in range(N):
#     print(nickname[i])
