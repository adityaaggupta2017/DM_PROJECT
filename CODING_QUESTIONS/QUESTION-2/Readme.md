Codeforces question link : https://codeforces.com/contest/1344/problem/A

Here when every guest currently in room k is moved to room k+akmodn.

The problem here is exactely one guest must be assigned to each room with no vacancies.

Steps:
1. We have simply taken integer and array input.
3. We have added the index of all the elements of that array to that array.
4. We have then stored the remainder of all the elements when divided by n in that array .
5. Then we made a hashset and added all the elements of that array.
6. Finally we check is size of set is equal to the size of array.
