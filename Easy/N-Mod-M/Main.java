
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
           short N = Short.valueOf(line.split(",")[0]);
           short M = Short.valueOf(line.split(",")[1]);
           System.out.println(N - (N/M)*M);
        }
    }
}
