1.Question :
Given an array of integer elements. Elements can appear two or more times. Find and display the element which appears only once.
Note : If there is no elements only once then print "NIL".
Example
Input : 7
0 1 1 2 2 2 3
Output : 0 3


2.Generate Following pattern
Input : 4
Output :
4
3 3
2 2 2
1 1 1 1


3.A message containing letters from A-Z is being encoded to numbers using the following mapping:
‘A’ – 1
‘B’ – 2
‘Z’ – 26
Given an encoded message containing digits, determine the total number of ways to decode it.
Example 1,
Input: 12
Output: 2
Explanation:
The number of ways decoding “12″ is 2.


4.Sum of Digits
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row.
Return 0 if there are no digits in the string.
Create a function sumDigits to perform sum, prototype of the function is given below
int sumDigits(String input1)
 The function sumDigits shoud return the sum of digits
Example 1:
    Input1: aa1bc2d3
    Output: 6
  Explanation: The string contains three digits such as 1,2 and 3, sum of the digits 6
Example 2:
    Input1: Chocolate
    Output: 0
Explanation: The string does not contains any digits, sum of the digits 0
Example 3:
    Input1: aa11b33
    Output: 44
Explanation: The string contains two digits such as 11 and 33, sum of the digits 44


5.Sum of Sums of Digits in Cyclic Order
Alex has been asked to do an assignment on sums of digits of a number. The assignment requires Alex to find the sum of sums of digits of a given number, as per the method mentioned below.
If the given number is 582109, the sum of sums of digits will be calculated as=(5)+(5+8)+(5+8+2)+ +(5+8+2+1) +(5+8+2+1+0) +(5+8+2+1+0+9)
=5+13+15+16+16+25
=90
Assumptions: For the assignment let us assume that the given number will always contain more than 1 digit i.e. the given number will always be>9



6.Replace every element with the next greatest
Given an array of integers, replace every element with the next greatest element on the right side in the array. Replace last element with 0 as there no element on the right side of it
Example:
Input array:
6
6 7 4 3 5 2 
Output: 7 5 5 5 2 0
