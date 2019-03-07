from operator import eq

s = input()
t = input()
count1 = 0
count2 = 0
repeat1 = s
repeat2 = t

while count1 < len(t) - 1:
    repeat1 += s
    count1 += 1

while count2 < len(s) - 1:
    repeat2 += t
    count2 += 1

if eq(repeat1, repeat2):
    print(1)
else:
    print(0)
