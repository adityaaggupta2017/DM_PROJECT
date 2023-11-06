//An infinite number of people (numbered 1,2,3,, etc.) are lined up to get a room at Hilbert's newest infinite hotel. The hotel contains an infinite number of floors (numbered
// 1,2,3, etc.), and each floor contains an infinite number of rooms (numbered 1,2,3,etc) .Initially the hotel is empty. Hilbert declares a rule on how the nth person
// is assigned a room: person n gets the first vacant room in the lowest numbered floor satisfying either of the following:

//          .the floor is empty
//          . the floor is not empty, and if the latest person taking a room in that floor is person m , then m+n is a perfect square

// Person 1 gets room 1 in floor 1 since floor 1 is empty.
// Person 2 does not get room 2 in floor 1 since 1 + 2 = 3 is not a perfect square.
// Person 2 instead gets room 1 in floor 2 since floor 2 is empty.
// Person 3 gets room 2 in floor 1 since 1 + 3 = 4 is a perfect square.
//
// Eventually, every person in the line gets a room in the hotel.
//
// Define `P(f, r)` to be `n` if person n occupies room `r` in floor `f`, and 0 if no person occupies the room. Here are a few examples:
// `P(1, 1) = 1`
// `P(1, 2) = 3`
// `P(2, 1) = 2`
// `P(10, 20) = 440`
// `P(25, 75) = 4863`
// `P(99, 100) = 19454`
//
// Find the sum of all `P(f, r)` for all positive `f` and `r` such that `f * r = 71328803586048` and give the last 8 digits as your answer.

//This is a problem for explaining the hilbert infinite hotel problem with some specified conditions . Lets dive deeper into this question and understand how it works and is there any pattern .

// problem link - https://projecteuler.net/problem=359


import java.math.BigInteger;

import java.math.BigInteger;

import java.math.BigInteger;

public class HilbertGrandHotel {
    public static BigInteger P(BigInteger f, BigInteger r) {
        BigInteger x = f.add(r).divide(BigInteger.valueOf(2)).subtract(BigInteger.ONE);
        BigInteger n = x.multiply(x.add(BigInteger.ONE)).multiply(BigInteger.valueOf(2));

        if (f.equals(BigInteger.ONE)) {
            if (r.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                return n.add(x.add(BigInteger.ONE));
            } else {
                return n.add(x.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(3)));
            }
        }

        if (f.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE) && r.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            return n.add(r.divide(BigInteger.valueOf(2)));
        }

        if (f.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) && r.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            return n.add(x.add(BigInteger.ONE).add(f.divide(BigInteger.valueOf(2)))) ;
        }

        if (f.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) && r.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
            return n.add(x.multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(2)).add(r.divide(BigInteger.valueOf(2))));
        }

        x = x.subtract(BigInteger.ONE);
        n = x.multiply(x.add(BigInteger.ONE)).multiply(BigInteger.valueOf(2));
        return n.add(x.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(3)).add(f.divide(BigInteger.valueOf(2)))) ;
    }

    public static void main(String[] args) {
        BigInteger n = new BigInteger("71328803586048");
        BigInteger s = BigInteger.ZERO;

        for (BigInteger f = BigInteger.ONE; f.multiply(f).compareTo(n) <= 0; f = f.add(BigInteger.ONE)) {
            if (n.mod(f).equals(BigInteger.ZERO)) {
                BigInteger quotient = n.divide(f);
                s = s.add(P(f, quotient));
                if (!f.equals(quotient)) {
                    s = s.add(P(quotient, f));
                }
            }
        }

        System.out.println(s);
    }
}
