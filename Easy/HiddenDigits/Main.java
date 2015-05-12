
import java.io.*;

public class Main {

    static final String LETTERS = "abcdefghij";

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String res = "";
            char tmpC;
            byte tmpB;
            for (int i = 0; i < line.length(); i++) {
                tmpC = line.charAt(i);
                tmpB = isHidenNumber(tmpC);
                if (tmpB >= 0) {
                    res += tmpB;
                }
            }
            if (res == "") {
                res = "NONE";
            }
            System.out.println(res);
        }
    }

    static byte isHidenNumber(char c) {
        for (int i = 0; i < LETTERS.length(); i++) {
            if (c == LETTERS.charAt(i)) {
                return (byte) i;
            }
            if (Character.isDigit(c)) {
                return Byte.valueOf(c + "");
            }
        }
        return -1;
    }
}
