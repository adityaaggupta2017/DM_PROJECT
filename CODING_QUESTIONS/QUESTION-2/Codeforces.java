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
