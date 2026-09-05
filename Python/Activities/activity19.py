
import pandas as pd

# data
data = {
    "FirstName": ["Mohammed", "Ishaq", "Ahmed"],
    "LastName": ["Ahmed", "Mohammed", "Ishaq"],
    "Email": ["ishaq@example.com", "mohishaq@example.com", "ahmed12@example.com"],
    "PhoneNumber": [1234567891, 1234567892, 1234567893]
}

df = pd.DataFrame(data)
df.to_excel("users.xlsx", index=False)

print("Excel file created successfully!")
