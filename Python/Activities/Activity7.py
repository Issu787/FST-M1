
listitems = input("Enter a sequence of comma separated values: ").split(", ")

sum=0
for number in listitems:
  sum += int(number)
	
print("Sum of Numbers is: " + str(sum))

