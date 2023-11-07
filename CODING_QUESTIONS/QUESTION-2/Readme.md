Codeforces question link : https://codeforces.com/contest/1344/problem/A

Here an array of n integers is given and then every guest currently in room k is moved to room ```k+ a subcript kmodn```.
The problem here is exactely one guest must be assigned to each room with no vacancies.

Theme of the question: We have to check if the given array makes a complete residue system with respect of n. In easy words all the remainders must be different. 

Steps:
1. We have added the index of all the elements of that array to that array.
The logical reasoning behind this step is that each guest is moved to a new room and the that room is determined by adding the current room number to the value at that index.

2. We have then stored the remainder of all the elements when divided by n in that array. Since in step 2 guests are moved to rooms with numbers greater than n. So to ensure that the room number is within the range, we take the remainder when divided by n.

3. Then we made a hashset and added all the elements of that array. By making a hashset we check for duplicates. If no duplicates are found, that means all guests are again in different rooms are reallocation and our answer in this case is YES.
