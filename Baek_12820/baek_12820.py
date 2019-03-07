while True:
    check1=0;check2=0;check3=0;check4=0
    string = input()
    if not string:
        break
    for j in range(len(string)):
        if string[j].islower():
            check1 += 1
        elif string[j].isupper():
            check2 += 1
        elif string[j] == ' ':
            check4 += 1
        else:
            check3 += 1

    print(check1, ' ', check2, ' ', check3, ' ', check4)








