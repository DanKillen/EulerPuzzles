'''
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value
by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the
938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
'''

# Save names to a file and then sort it. Iterate over all the characters in the name and use their ASCII
# value as a basis for their worth. Take quotation marks into account.
# Add up and present the total
total = 0
wordNumber = 0
with open('Euler22.txt') as f:
    words = []
    for line in f:
        temp = line.split(",")
        for i in temp:
            words.append(i)

words.sort()
for i in words:
    wordNumber += 1
    thisWord = 0
    for c in i:
        thisWord += (ord(c)-64)
    thisWord += 60
    thisWord *= wordNumber
    total += int(thisWord)
print(total)
