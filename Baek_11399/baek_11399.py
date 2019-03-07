n = int(input())
p = input()
time=[0]*int((len(p)+1)/2)
j=0
time2 = time
min = None

for i in range(0,len(p),2):
    time[j] = int(p[i])
    j += 1

for i in range(len(time)):
    if min is None:
        min = time[i]
    elif time[i] < min:
        min = time[i]

