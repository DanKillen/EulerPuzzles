with open('Euler13.txt') as f:
    total = 0
    lines = f.readlines()
    for lines in lines:
        total += int(lines)
    print(total)
