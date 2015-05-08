
public class Main {

    public static void main(String[] args) {
        int s = 2;
        int count = 1;
        for (int i = 3; count < 1000; i += 2) {

            boolean isPrime = true;
            for (int j = 3; j < i / 2; j += 2) {
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
