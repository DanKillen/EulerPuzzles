#  2 to the power of 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

# What is the sum of the digits of the number 21000?

total = 0
root = (2 ** 1000)
for i in iter(str(root)):
    total += int(i)
print(total)



