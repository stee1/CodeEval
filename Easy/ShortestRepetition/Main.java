
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            int repetitionLength = 1;
            char tmp = line.charAt(0);
            for (int i = 1; i < line.length(); i++) {
                if (tmp == line.charAt(i)) {
                    break;
                }
                repetitionLength++;
            }

            System.out.println(repetitionLength);
        }
    }
}
