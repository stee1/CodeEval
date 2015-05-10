
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String res = "";
            boolean needChanges = true;
            char tmp;
            for (int i = 0; i < line.length(); i++) {
                tmp = line.charAt(i);

                if ((tmp >= 'a' && tmp <= 'z') || (tmp >= 'A' && tmp <= 'Z')) {

                    if (needChanges) {
                        res += Character.toUpperCase(tmp);
                        needChanges = false;
                    } else {
                        needChanges = true;
                        res += tmp;
                    }
                } else {
                    res += tmp;
                }

            }
            System.out.println(res);
        }
    }
}
