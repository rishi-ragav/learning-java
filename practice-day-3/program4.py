"""
19.Write a python function, nearest_palindrome() which accepts a 
number and returns the nearest palindrome greater than the 
given number. 
          Sample   Input	  Expected Output
	      99	    101
               1221	   1331
"""


def nearest_palindrome(number):
    while True:
        number += 1
        if str(number) == str(number)[::-1]:
            return number
        
print(nearest_palindrome(99))
print(nearest_palindrome(1221))
print(nearest_palindrome(1234))



