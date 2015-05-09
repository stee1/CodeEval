
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String res = line.substring(0, 1);

            for (int j = 1, i = 1; i < line.length(); i++) {
                if (res.charAt(j - 1) != line.charAt(i)) {
                    res += line.charAt(i);
                    j++;
                }
            }
            System.out.println(res);
        }
    }
}
