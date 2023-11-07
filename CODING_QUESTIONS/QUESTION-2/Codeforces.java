import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++) {
            int n = sc.nextInt();
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                l.set(i, l.get(i) + i);
            }
            for (int i = 0; i < n; i++) {
                l.set(i, l.get(i) % n);
            }
            Set<Integer> set = new HashSet<Integer>();
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
