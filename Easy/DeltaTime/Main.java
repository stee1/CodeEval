
import java.io.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
            Date date1 = df.parse(line.split(" ")[0]);
            Date date2 = df.parse(line.split(" ")[1]);

            long diff = date2.getTime() - date1.getTime();

            long diffSeconds = Math.abs(diff / 1000 % 60);
            long diffMinutes = Math.abs(diff / (60 * 1000) % 60);
            long diffHours = Math.abs(diff / (60 * 60 * 1000) % 24);

            String res = (diffHours < 10 ? "0" + diffHours : diffHours)
                    + ":"
                    + (diffMinutes < 10 ? "0" + diffMinutes : diffMinutes)
                    + ":"
                    + (diffSeconds < 10 ? "0" + diffSeconds : diffSeconds);

            System.out.println(res);
        }
    }
}
