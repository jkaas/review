public class coutnumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <100; x++) {
            if (x % 2 == 0) {
                continue;
            }
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}
