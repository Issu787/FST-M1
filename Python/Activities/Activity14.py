count = int(input("How many Fibonacci nums to generate? "))

def fibonacci(num):
    if num <= 1:
        return num
    else:
        return(fibonacci(num-1) + fibonacci(num-2))

if count <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for x in range(count):
        print(fibonacci(x))
