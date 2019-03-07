NM = input()
num = input()
nums = []

N = int(NM.split()[0])
M = int(NM.split()[1])
for i in range(N):
    nums.append(int(num.split()[i]))

count = 0

left = 0
right = 0
sum = 0

while left <= right and right <= N:
    if sum >= M:
        if sum == M:
            count += 1
        sum -= nums[left]
        left += 1
    else:
        if right == N:
            break
        sum += nums[right]
        right += 1

print(count)




# for i in range(N):
#     sum = 0
#     j = i;
#     j+=1;
#     for j in range(i, N, 1):
#         sum += nums[j]
#         if sum == M:
#             count += 1
#             break
#         elif sum > M:
#             break

# for i in range(N):
#     sum = 0
#     j = i
#     while j<N and sum<M:
#         sum += nums[j]
#         j += 1
#         if sum == M:
#             count += 1
