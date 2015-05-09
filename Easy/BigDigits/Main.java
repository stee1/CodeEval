
import java.io.*;

public class Main {

    final static String[] NUMBERS = {
        "-**----*--***--***---*---****--**--****--**---**--",
        "*--*--**-----*----*-*--*-*----*-------*-*--*-*--*-",
        "*--*---*---**---**--****-***--***----*---**---***-",
        "*--*---*--*-------*----*----*-*--*--*---*--*----*-",
        "-**---***-****-***-----*-***---**---*----**---**--",
        "--------------------------------------------------"};

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] res = new String[NUMBERS.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = "";
            }

            for (int i = 0; i < line.length(); i++) {
                if (Character.isDigit(line.charAt(i))) {
                    byte n = Byte.valueOf(line.charAt(i) + "");
                    for (int j = 0; j < NUMBERS.length; j++) {
                        res[j] += NUMBERS[j].substring(5 * n, 5 * (n + 1));
                    }
                }
            }

            for (String str : res) {
                System.out.println(str);
            }

        }
    }
}
