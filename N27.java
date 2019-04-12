import java.util.*;
public class N27 {
    public static void main(String[] args) {
        int tot = 0;
        for (int x = 0; x < 1000000; x++) {
            if (process()) {
                tot++;
            }
        }
        System.out.println(tot/1000000.0);
        System.out.println(17.0/18);
    }
    public static boolean process() {
        double sum = 1;
        double n = 0.5;
        Random r = new Random();
        int temp;
        while (n >= 1.0/16777216) {
            temp = Math.abs(r.nextInt())%2;
            if (temp == 0) {
                sum += n;
            }
            else {
                sum -= n;
            }
            n /= 2;
        }
        return (sum > 1.0/7);
    }
}
