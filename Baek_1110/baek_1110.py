N = int(input())
new = -1
count = 0
origin_N = N

while True:
    N_ten = int(N/10)
    N_one = int(N%10)

    sum = N_ten + N_one

    new = N_one*10 + (sum%10)
    count += 1
    if origin_N == new:
        break
    else:
        N = new

print(count)