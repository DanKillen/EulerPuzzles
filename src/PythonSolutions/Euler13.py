'''
Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
'''

# This program simply adds all the numbers together, quite easy!

with open('Euler13.txt') as f:
    total = 0
    lines = f.readlines()
    for lines in lines:
        total += int(lines)
    print(total)
