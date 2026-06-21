tuple = input("Provide the items with comma separated: ").split(",")

print("Given list is ", tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in tuple:
    if (int(num) % 5 == 0):
        print(num)