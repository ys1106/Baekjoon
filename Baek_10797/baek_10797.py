num = input()
car = input()
count = 0

for i in range(0, len(car), 2):
    if(car[i]==num):
        count += 1

print(count)