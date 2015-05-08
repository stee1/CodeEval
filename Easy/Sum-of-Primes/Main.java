
public class Main {

    public static void main(String args[]) {
        int s = 0;
        int count = 0;
        for (int i = 2; count < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                s += i;
                count++;
            }
        }
        System.out.println(s);
    }
}
