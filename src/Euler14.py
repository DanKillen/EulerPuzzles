def collatz_steps(n):
    steps = 0
    while n != 1:
        if n % 2 == 0:
            steps = steps + 1
            n = n / 2

        else:
            steps = steps + 1
            n = 3 * n + 1
    return steps


longestChain = 1
longestCheck = 1
startingNumber = 0
i = 0
while i < 1000000:
    longestCheck = collatz_steps(i)
    if longestChain < longestCheck:
        longestChain = longestCheck
        startingNumber = i
    i = i + 1

print(startingNumber)
