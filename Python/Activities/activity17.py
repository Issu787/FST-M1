import pandas as pd

# Create data
data = {
    "Usernames": ["admin", "babage", "DIshaq"],
    "Passwords": ["password", "bung123", "ISSaq"]
}

# Create DataFrame
df = pd.DataFrame(data)

# Write to CSV
df.to_csv("users.csv", index=False)

print("CSV file created successfully!")