#Noob method to take input from user in python
name = input("Enter your name: ")
age = int(input("Enter your age: "))
height = float(input("Enter your height in meters: "))
grade = input("Enter your grade: ")[0]
print(f"Hello, {name}!")
print(f"You are {age} years old.")
print(f"Your height is {height} meters.")
print(f"Your grade is {grade}.")


#Pro method to take input from user in python
# We can also use the input() function to get multiple inputs in one line, separated by spaces. For example:
# name, age, height, grade = input("Enter your name, age, height in meters, and grade (separated by spaces): ").split()
name1 , age1 , height1 , grade1 = input("Enter your name, age, height in meters, and grade (separated by spaces): ").split()
name1 = name1
age1 = int(age1)
height1 = float(height1)
grade1 = grade1[0]
print(f"Hello, {name1}!")
print(f"You are {age1} years old.")
print(f"Your height is {height1} meters.")
print(f"Your grade is {grade1}.")
