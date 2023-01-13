#  2 to the power of 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

# What is the sum of the digits of the number 21000?

oneToTen = 39
elevenToTwenty = 68
tenSuffixes = (6 * 40) + (5 * 30) + (7 * 10)

oneToHundred = (oneToTen * 9) + elevenToTwenty + tenSuffixes

onetoThousand = oneToHundred * 10

hundredSuffixes = (36 * 100) + (10 * 876) - 26

runningTotal = hundredSuffixes + onetoThousand

print(runningTotal)
