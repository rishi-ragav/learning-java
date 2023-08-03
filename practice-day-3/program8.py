"""
Input :A string of comma seperated numbers.the number 5 and 8 
are present in the list.Assume that 8 always comes after 5.
case1:
num1= add all the numbers which do not lie between 5 and 8 in the input
case2:
num2 = number formed by concatenating all numbers from 5 to 8

output  sum of num1 and num2
example
1) 3,2,6,5,1,4,8,9

num1=3+2+6+9=20

num2=5148

o/p=5148+20=5168    
"""
# Input
input_string = '3,2,6,5,1,4,8,9'
input_list = input_string.split(",")
print(input_list)
# Case 1
num1 = 0
for i in range(len(input_list)):
    if input_list[i] == "5":
        start_index = i
    if input_list[i] == "8":
        end_index = i
for i in range(len(input_list)):
    if i < start_index or i > end_index:
        num1 += int(input_list[i])
print(num1)
# Case 2
num2 = ""
for i in range(len(input_list)):
    if i >= start_index and i <= end_index:
        num2 += input_list[i]
print(num2)
# Output
print(int(num1) + int(num2))


