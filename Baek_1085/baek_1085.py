x, y, w, h = input().split()

x = int(x)
y = int(y)
w = int(w)
h = int(h)

if x < w-x:
    min1 = x
else:
    min1 = w-x

if y<h-y:
    min2 = y
else:
    min2 = h-y

if min1 < min2:
    print(min1)
else:
    print(min2)
