
fruit_shop = {
    "apple": 120,
    "banana": 40,
    "cherry": 250,
    "orange": 80,
    "grapes": 150
}

print("Fruit Shop:", fruit_shop)

fruit = input("Enter the fruit you want to check: ").lower()

if fruit in fruit_shop:
    print(f"{fruit.capitalize()} is available at Rs.{fruit_shop[fruit]} per kg.")
else:
    print(f"Sorry, {fruit.capitalize()} is not available.")
