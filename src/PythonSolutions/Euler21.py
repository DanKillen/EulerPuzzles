'''
Let d(n) be defined as the sum of proper divisors of n (numbers less than n
which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
'''

# Iterate over all the numbers in range and compare them to each number ahead of it
# Amicable numbers are given a 'True' bool in their array and then added at the
# end.

divisorSums = [0 for i in range(10001)]
divisorSums[0] = -1
amicableNums = [False for j in range(10001)]
for i in range(0, 10001):
    divisor = i // 2
    while divisor != 0:
        if i // divisor == i / divisor:
            divisorSums[i] += divisor
        divisor = divisor - 1
for i in range(0, 10001):
    for j in range(i+1, 10001):
        if divisorSums[i] == j and divisorSums[j] == i and divisorSums[i] > 1:
            amicableNums[i] = True
            amicableNums[j] = True
totalSum = 0
for i in range(0, 10001):
    if amicableNums[i]:
        totalSum = totalSum + i
'''
for i in range(0, 500):
    print(i, " Divisor Sums:", divisorSums[i], " And their amicable nums: ", amicableNums[i])
'''
print(totalSum)



