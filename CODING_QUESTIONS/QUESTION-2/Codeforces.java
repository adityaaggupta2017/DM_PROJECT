// Hilbert's Hotel is a very unusual hotel since the number of rooms is infinite! 
// In fact, there is exactly one room for every integer, including zero and negative integers.
// Even stranger, the hotel is currently at full capacity, meaning there is exactly one guest in every room.
// The hotel's manager, David Hilbert himself, decides he wants to shuffle the guests around because he thinks this will create a vacancy (a room without a guest).
//
// For any integer k and positive integer n, let kmodn denote the remainder when k is divided by n. 
// More formally, r=kmodn is the smallest non-negative integer such that k−r is divisible by n.
// It always holds that 0≤kmodn≤n−1.
// For example, 100mod12=4 and (−1337)mod3=1.
//
// Then the shuffling works as follows. There is an array of n integers a0,a1,…,an−1.
// Then for each integer k, the guest in room k is moved to room number k+akmodn.
//
// After this shuffling process, determine if there is still exactly one guest assigned to each room.
// That is, there are no vacancies or rooms with multiple guests.

//link to the problem : https://codeforces.com/contest/1344/problem/A

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++) {
            int n = sc.nextInt();
            ArrayList<BigInteger> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextBigInteger());
            }
            for (int i = 0; i < n; i++) {
                l.set(i, l.get(i).add(BigInteger.valueOf(i)));
            }
            for (int i = 0; i < n; i++) {
                l.set(i, l.get(i).mod(BigInteger.valueOf(n)));
            }
            Set<BigInteger> set = new HashSet<BigInteger>();
            for (int i = 0; i < n; i++) {
                set.add(l.get(i));
            }
            if (set.size() == l.size()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
