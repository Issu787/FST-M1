
listitems = input("Enter a sequence of comma separated values: ").split(",")

print("Given list is ", listitems)

firstElement = listitems[0]

lastElement = listitems[-1]

if (firstElement == lastElement):
    print(True)
else:
    print(False)