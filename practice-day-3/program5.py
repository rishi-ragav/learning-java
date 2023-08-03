
"""
A teacher is in the process of generating few reports based 
on the marks scored by the students of her class in a project 
based assessment.
Assume that the marks of her 10 students are available in a 
tuple. The marks are out of 25.
Write a python program to implement the following functions:
1.find_more_than_average(): Find and return the percentage of 
students who have scored more than the average mark of the 
class.
2.generate_frequency(): Find how many students have scored the 
same marks. For example, how many have scored 0, how many have 
scored 1, how many have scored 3….how many have scored 25. 
The result should be populated in a list and returned.
3.sort_marks(): Sort the marks in the increasing order from 
0 to 25. The sorted values should be populated in a list and
 returned.

Sample Input	                            Expected Output
list_of_marks = (12,18,25,24,2,5,18,20,20,21)	70.0

[0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 2,
 0, 2, 1, 0, 0, 1, 1]

[2, 5, 12, 18, 18, 20, 20, 21, 24, 25]
"""
marks = (12,18,25,24,2,5,18,20,20,21)
average = sum(marks)/len(marks)
sum = sum(marks)
print("sum is ",sum)
count = len(marks)

print("-----------------------------")
print("Average is ",average)
a=0

for i in marks:
    if i > average:
        a = a+1

print(a)

more_than_average = (a/count)*100
print("-----------------------------")
print("Percentage of students above the average",more_than_average)
print("-----------------------------")


frequency = []


for i in range(26):
   count=0
   for j in marks: 
        if i==j:
            count = count+1
   frequency.append(count)
    
    

print("Frequency",frequency)
print("-----------------------------")
print("-----------------------------")
marks1 = tuple(sorted(marks))
print("Sorted marks list")
print(marks1)
print("-----------------------------")
print("-----------------------------")
