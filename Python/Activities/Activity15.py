try:
    # This will raise a NameError because 'x' is not defined
    print(x)
except NameError as e:
    print("Caught a NameError:", e)

print("Program continues running smoothly...")
