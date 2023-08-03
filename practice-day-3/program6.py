"""
Write a python function, check_double(number) which accepts 
a whole number and returns True if it satisfies the given
conditions.
1.	The number and its double should have exactly the 
same number of digits.
2.	Both the numbers should have the same digits ,but in 
      different order.
Otherwise it should return False.

Example: If the number is 125874 and its double, 251748,
 contain exactly the same digits, but in a different order.
"""

def check_double(number):
    double = number*2
    if len(str(number)) == len(str(double)):
        for i in str(number):
            if i in str(double):
                return True
    return False
print(check_double(125874))