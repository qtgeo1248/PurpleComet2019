public class N19 {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 3; i <= 33; i++) {
            long term = 2 * (long)Math.pow(i, 4)
                        - 25 * (long)Math.pow(i, 3)
                        + 33 * (long)Math.pow(i, 2);
            product *= term;
            product = product % 2019;
        }
        System.out.println(product & 2019);
    }
}
