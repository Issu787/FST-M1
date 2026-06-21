num = int(input("Enter a number to generate its multiplication table: "))

print(f"\nMultiplication Table of {num}:")
for i in range(1, 11):
    #print(f"{num} x {i} = {num * i}")
    print(num, 'x', i, '=', num*i)

