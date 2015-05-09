
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            if (line.length() > 55) {
                line = line.substring(0, 40);
                if (line.indexOf(" ") > 0) {
                    line = line.substring(0, line.lastIndexOf(" "));
                }
                line += "... <Read More>";
            }
            System.out.println(line);
        }
    }
}
