This is the readme file explaining the approach towards the question : https://projecteuler.net/problem=359

We want P(f,r) such that f*r = 71328803586048


This problem will tell you how can question can be made in such a topic . How a number such large can be simplified using patterns .    

Thus this will give you idea that it forms a regular pattern for solving this problem .   

Steps:    
1 .  We first plot the values rows and column wise for smaller inputs and see if we can find any pattern  .

2 . Thus this question reduces to a grid question with some pattern attached to it .    

|    | 1   | 2    | 3    | 4    | 5    | 6   | 7    | 8    | 9    | 10    |
|----|-----|------|------|------|------|-----|------|------|------|-------|
| 1  | m=1 | m=3  | m=6  | m=10 | m=15 | m=21 | m=28 | m=36 | m=45 | m=55  |
| 2  | m=2 | m=7  | m=9  | m=16 | m=20 | m=29 | m=35 | m=46 | m=54 | m=67  |
| 3  | m=4 | m= 5 | m=11 | m=14 | m=22 | m=27 | m=37 | m=44   | m=56 | m=65  |
| 4  | m=8  | m= 17  |   m=19   |   m= 30  | m= 34    | m=47 | m=53 | m= 68    | m=76     | m= 93 |
| 5  | m=12  | m= 13  |   m=  23  |   m=26   |  m=38    | m=43 | m= 57 |   m= 64  | m=80     | m=89  |
| 6  | m=18  | m=31   |   m=33   |   m=48   |   m=52   | m=69 | m=75 |   m=94   |  m=102    | m=123 |
| 7  | m=24  | m= 25  |    m=39  |   m= 42  |   m=58   | m=63 | m=81 |  m= 88   |   m=108   | m=117 |
| 8  | m=32   |  m=49   |    m=51  |   m=70   |   m=74   | m=95 | m=101 |  m=124    |   m=132   | m=157 |
| 9  | m= 40  |  m=41   |    m=59  |   m=62   |   m=82   | m=87  | m=109 |  m= 116   |   m=140   | m=149    |
| 10 | m=50   |  m= 71  |    m=73  |   m=96   |   m=100   | m=125  | m=131   |  m=158    |   m=166   | m=195    |


Let the row number tell me the floor number f as in the function P(f,r) and let the column number tell me the room number which is represented by r in the function P(f,r) . Now lets fill the grid with the respective value of m ie. The person number which will be in this room . 


Most of the hilbert problem are much better viewed in 2d or 3d grid .
Now we found the P(f,r) values for the smaller cases and stored them in the grid  :

Using mathematical tools like wolfram alpha we get to the general pattern that is being followed in this problem :    
There are 6 cases:    
Let us define two variables counter1 and counter2 which are such that :    
counter1 = (floor_number + room_number)/2 - 1 ;
counter2 = (2)* (counter1)*(counter1+1);

Now when floor_number is 1 :    
if (room_number is even):  
answer is (counter1 + counter2 +1)

else:
answer is (counter2 + 3*counter1 + 3);    


When floor_number is odd:    
if (room_number is even):    
answer is (counter2 + counter1/2);  


When floor_number is even :    
if (room_number is even):    
answer is (counter1 + counter2 + 1 + floor_number / 2 )

else:
answer is (counter2 + 2*counter1 + 2 + (room_number - 1) /2)

Else for all other cases:    
counter1 -=1 
counter2 = 2*counter1*counter1     
answer is (counter2 + 3*counter1 + 3 + floor_number / 2)



THESE ARE SOME OF THE MATHEMATICAL RESULTS WHICH CAN BE FOUND ON SEEING A PATTERN .    
Now we just iterate over all the divisors of the number 71328803586048  . The quotient and corresponding divisors are the floor_number and the room_number . Thus we get the desired answer .  

The answer comes out to be :    
7631697331548232565040632119 


Last 8 digits are:
```40632119``` which is the right answer . 

This is how we can solve some of the difficult questions with help of maths platforms and pattern findings .    


```STEPS TO RUN THE CODE```:
1) if using an IDE simply run the java code after making a java file .
2) if using terminal use javac  file_name
