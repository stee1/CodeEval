
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] strings = line.split(",");
            byte res = (byte) strings[0].length();

            for (String item : strings) {
                byte steps = 0;
                byte searchIndex = (byte) (item.indexOf("Y") - 1);
                while (item.charAt(searchIndex) != 'X') {
                    searchIndex--;
                    steps++;
                }
                if (res > steps) {
                    res = steps;
                }
            }
            System.out.println(res);
        }
    }
}
