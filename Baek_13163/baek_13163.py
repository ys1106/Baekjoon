
nickname = []
N = int(input())

for i in range(N):
    nickname[i] = input()
    # print(nickname[i])
    for j in range(1,len(nickname[i])):
        print('god', nickname[i].split(' ')[j])
