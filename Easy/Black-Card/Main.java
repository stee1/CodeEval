import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] values = line.split(" \\| ");

            int number = Integer.parseInt(values[1]);
            ArrayList<String> pirates = new ArrayList<String>();
            for (String pirate : values[0].split(" ")) {
                pirates.add(pirate);
            }
            int j=0;
            for (int i = 1; pirates.size()>1; i++) {
                int ind = (i-1)%pirates.size();
                if (i == number)  {
                    pirates.remove(ind);
                    i=0;
                }
            }

            System.out.println(pirates.get(0));
        }
    }
}
