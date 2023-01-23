'''
Starting in the top left corner of a 2×2 grid, and only being able to move to
# the right and down, there are exactly 6 routes to the bottom right corner.
'''

# I found this confusing! It dealt with math that I was not used to
# Through pen and paper I realised there was some deep patterns involved
# And eventually figured out that I had to read up on binomial distribution
# More revision needed!

# This function returns the factorial of the given number
def fact(x):
    if x == 1:
        return 1
    else:
        return x*fact(x-1)


# Binomial coefficient formula
d = (fact(20*2))/(fact(20)*fact(20))
print(d)
