while True:
    AB = input()
    A = int(AB.split(' ')[0])
    B = int(AB.split(' ')[1])
    if(A==0 and B==0):
        break
    print(A + B)