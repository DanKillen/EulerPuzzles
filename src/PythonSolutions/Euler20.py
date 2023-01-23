'''
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
'''

# Simply worked out the 100 factorial and then added the resultant digits together
import math

result = math.factorial(100)
resultString = str(result)
list_of_numbers = list(map(int, resultString.strip()))
print(sum(list_of_numbers))

