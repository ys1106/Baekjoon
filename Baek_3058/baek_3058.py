import sys
resultSum = []
resultMin = []
t = int(input())
for i in range(t):
    num = input()
    nums = num.split(' ')
    #print(nums)
    nums = [int (j) for j in nums]

    # for j in range(7):
    #     num[j] = int(nums[j])
    sum = 0
    min = sys.maxsize
    for j in range(7):
        if nums[j]%2 == 0:
            sum += nums[j]
            if nums[j] < min:
                min = nums[j]

    # for j in range(1,7):
    #     if(nums[j]%2==0 & nums[j] < min):
    #         min = nums[j]
    resultSum.append(sum)
    resultMin.append(min)

for i, x in enumerate(resultMin):
    print(resultSum[i], x)
