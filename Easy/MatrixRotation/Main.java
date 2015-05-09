
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] values = line.split(" ");
            int N = (int) Math.sqrt(values.length);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(values[(N - (j + 1)) * N + i] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
