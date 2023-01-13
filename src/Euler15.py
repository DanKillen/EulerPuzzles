def fact(x):
    if x == 1:
        return 1
    else:
        return x*fact(x-1)


d = (fact(20*2))/(fact(20)*fact(20))
print(d)
