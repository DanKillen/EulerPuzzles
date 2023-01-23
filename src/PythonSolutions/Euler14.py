'''
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
'''
# collatz steps will return the number of steps needed for the passed number
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

# Using (for i in 1000000) is much slower than this! Must remember that

for i in range(1, 1000001):
    longestCheck = collatz_steps(i)
    if longestChain < longestCheck:
        longestChain = longestCheck
        startingNumber = i

print(startingNumber)
