
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            double value = Double.parseDouble(line);

            int d = (int) value;
            int m = (int) ((value - d) * 60);
            int s = (int) ((value - d - m / 60.) * 3600);

            System.out.println(d + "." + (m < 10 ? "0" + m : m) + "'"
                    + (s < 10 ? "0" + s : s) + "\"");
        }
    }
}
