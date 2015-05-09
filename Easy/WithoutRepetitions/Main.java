
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            for (int i = 0; i < line.length() - 1; i++) {
                if (line.charAt(i) == line.charAt(i + 1)) {
                    line = line.replaceAll(line.charAt(i) + "" + line.charAt(i + 1), line.charAt(i) + "");
                    i--;
                }
            }
            System.out.println(line);
        }
    }
}
