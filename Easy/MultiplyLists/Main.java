
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] lists = line.split("\\| ");
            String[] list_one = lists[0].split(" ");
            String[] list_two = lists[1].split(" ");

            for (int i = 0; i < list_one.length; i++) {
                System.out.print(Integer.valueOf(list_one[i])
                        * Integer.valueOf(list_two[i]) + " ");
            }

            System.out.println();
        }
    }
}
