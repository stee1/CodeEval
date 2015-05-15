
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] numbers = line.split(" ");
            String res = "";
            int count;

            for (int i = 0; i < numbers.length; i++) {
                count = 1;
                for (; i < numbers.length - 1 && numbers[i].equals(numbers[i + 1]); i++) {
                    count++;
                }
                res += count + " " + numbers[i] + " ";
            }

            System.out.println(res);
        }
    }
}
