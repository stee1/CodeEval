
public class Main {

    public static void main(String[] args) {
        int maxPrimePalindrome = 2;
        String tmp;
        for (int i = 3; i < 1000; i += 2) {

            boolean isPrime = true;
            for (int j = 3; j < i / 2; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                tmp = String.valueOf(i);
                if (i < 10 || (i > 10 && (tmp.charAt(0)
                        == tmp.charAt(tmp.length() - 1)))) {
                    maxPrimePalindrome = i;
                }

            }
        }
        System.out.println(maxPrimePalindrome);
    }
}
