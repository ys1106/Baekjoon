NX = input()
N = int(NX.split(' ')[0])
X = int(NX.split(' ')[1])
nums = input()
A = []
small = ''

for i in range(N):
    A.append(int(nums.split(' ')[i]))

for i in range(N):
    if A[i] < X:
        small += str(A[i])
        small += ' '

print(small)