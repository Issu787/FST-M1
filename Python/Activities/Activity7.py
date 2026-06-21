
listitems = input("Enter list items separated by spaces: ").split(" ")

listitems=[int(x) for x in listitems]

print("Given List: " + str(listitems))

total = sum(listitems)
print("Sum of Numbers is: " + str(total))