
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] input = line.split(" ");
            int l = Integer.valueOf(input[0]), d = Integer.valueOf(input[1]),
                    n = Integer.valueOf(input[2]), position = 6, count = 0;

            int countExistingBat = 0,
                    positionExistingBat = n > 0 ? Integer.valueOf(input[3]) : -1;

            while (position <= l - 6) {
                if (positionExistingBat < 0) {
                    count++;
                } else {
                    if (position + d <= positionExistingBat) {
                        count++;
                    } else {
                        position = positionExistingBat;
                        countExistingBat++;
                        positionExistingBat = countExistingBat < n
                                ? Integer.valueOf(input[3 + countExistingBat]) : -1;
                    }
                }
                position += d;
            }

            System.out.println(count);
        }
    }
}
