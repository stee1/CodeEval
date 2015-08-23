import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] row = line.split(" ");
            byte x = Byte.parseByte(row[0]);
            byte y = Byte.parseByte(row[1]);
            byte n = Byte.parseByte(row[2]);
            String res = "";

            for (byte i=1; i<=n; i++) {
                if ((i % x != 0) && (i % y != 0))
                    res += i;
                else {
                    if (i % x == 0)
                        res += "F";
                    if (i % y == 0)
                        res += "B";
                }
                res += " ";
            }
            System.out.println(res);
        }
    }
}
