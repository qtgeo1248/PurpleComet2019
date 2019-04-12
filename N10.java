import java.lang.Math;

public class N10 {
    public static boolean checkDigits(int n) {
        String num = "" + n;
        for (int i = 0; i < num.length(); i++) {
            if ((Integer.parseInt(num.substring(i, i + 1)) % 3) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 2019; i++) {
            if ((i % 3 != 0) && checkDigits(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
