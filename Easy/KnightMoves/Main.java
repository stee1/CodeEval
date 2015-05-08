
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            char C = line.charAt(0);
            byte N = Byte.valueOf(line.substring(1));
            String tmp;
            ArrayList res = new ArrayList();
            //left
            if (C - 2 >= 'a') {
                if (N - 1 >= 1) {
                    tmp = "";
                    tmp += (char) (C - 2);
                    tmp += N - 1 + " ";
                    res.add(tmp);
                }
                if (N + 1 <= 8) {
                    tmp = "";
                    tmp += (char) (C - 2);
                    tmp += N + 1 + " ";
                    res.add(tmp);
                }
            }
            //top
            if (N + 2 <= 8) {
                if (C - 1 >= 'a') {
                    tmp = "";
                    tmp += (char) (C - 1);
                    tmp += N + 2 + " ";
                    res.add(tmp);
                }
                if (C + 1 <= 'h') {
                    tmp = "";
                    tmp += (char) (C + 1);
                    tmp += N + 2 + " ";
                    res.add(tmp);
                }
            }
            //rigth
            if (C + 2 <= 'h') {
                if (N - 1 >= 1) {
                    tmp = "";
                    tmp += (char) (C + 2);
                    tmp += N - 1 + " ";
                    res.add(tmp);
                }
                if (N + 1 <= 8) {
                    tmp = "";
                    tmp += (char) (C + 2);
                    tmp += N + 1 + " ";
                    res.add(tmp);
                }
            }
            //bottom
            if (N - 2 >= 1) {
                if (C - 1 >= 'a') {
                    tmp = "";
                    tmp += (char) (C - 1);
                    tmp += N - 2 + " ";
                    res.add(tmp);
                }
                if (C + 1 <= 'h') {
                    tmp = "";
                    tmp += (char) (C + 1);
                    tmp += N - 2 + " ";
                    res.add(tmp);
                }
            }

            java.util.Collections.sort(res);

            tmp = "";
            for (Object item : res) {
                tmp += item;
            }
            System.out.println(tmp);
        }
    }
}
