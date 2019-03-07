T = int(input())
A = []
max1 = 0
max2 = 0
max3 = 0

for i in range(T):
    for j in range(10):
        A.append(input())
    for k in range(10):
        if(A[k] > max1):
            max1 = A[k]
    for k in range(10):
        if(A[k]>max2 & A[k]<=max1):
            max2 = A[k]
    for k in range(10):
        if(A[k]>max3 & A[k]<=max2):
            max3 = A[k]

    print(max3)