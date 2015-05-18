
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String res = "";
            for (String word : line.split(" ")) {
                res += word.charAt(word.length() - 1)
                        + word.substring(1, word.length() - 1)
                        + word.charAt(0) + " ";
            }
            System.out.println(res);
        }
    }
}
