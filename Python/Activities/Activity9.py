list1 = input("Provide the first list with comma separated: ").split(",")
list2 = input("Provide the second list with comma separated: ").split(",")

print(f"List 1 is : {list1}")
print(f"List 2 is : {list2}")

newList = []
	
for num in list1:
    if (int(num) % 2 != 0):
        newList.append(num)

for num in list2:
    if (int(num) % 2 == 0):
        newList.append(num)

print(f"Odd List is : {newList}")