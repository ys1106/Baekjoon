AB = input()
A = AB.split()[0]
B = AB.split()[1]
sum1 = 0
sum2 = 0

for i in range(len(A)):
    sum1 += int(A[i])
for i in range(len(B)):
    sum2 += int(B[i])

print(sum1*sum2)
