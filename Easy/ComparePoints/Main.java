
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            short O = Short.valueOf(line.split(" ")[0]);
            short P = Short.valueOf(line.split(" ")[1]);
            short Q = Short.valueOf(line.split(" ")[2]);
            short R = Short.valueOf(line.split(" ")[3]);
            String result = "";
            if (O == Q && P == R) {
                result = "here";
            } else {
                if (P < R) {
                    result = "N";
                } else if (P > R) {
                    result = "S";
                }
                if (O < Q) {
                    result += "E";
                } else if (O > Q) {
                    result += "W";
                }
            }
            System.out.println(result);
        }
    }
}
