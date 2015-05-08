
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            short N = Short.valueOf(line.split(";")[0]);
            short size = (short) line.substring(line.indexOf(";")).split(" ").length;
            int[] arr = new int[size];
            for (short i = 0; i < size; i++) {
                arr[i] = Short.valueOf(line.substring(line.indexOf(";") + 1).split(" ")[i]);
            }
            int res, s = res = 0;
            for (short i = 0; i < size; i++) {
                s = 0;
                for (short j = i; i + N <= size && j < i + N; j++) {
                    s += arr[j];
                }
                if (s > res) {
                    res = s;
                }
            }
            System.out.println(res);
        }
    }
}
