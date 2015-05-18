
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] values = line.split(",");
            int count = 0, l = values.length;
            String res = "None";

            for (int i = 0; i < l; i++) {
                count = 0;
                for (int j = i; j < l; j++) {
                    if (values[i].equals(values[j])) {
                        count++;
                    }
                }
                if (count > l / 2) {
                    res = String.valueOf(values[i]);
                    break;
                }
            }

            System.out.println(res);
        }
    }
}
