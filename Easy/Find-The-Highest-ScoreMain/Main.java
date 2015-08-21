import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] row = line.split("\\| ");
            String[][] values = new String[row.length][];
            String res = "";

            for (int i=0; i< row.length; i++)
                values[i] = row[i].split(" ");

            for (int i=0; i < values[0].length; i++) {
                int max = Integer.parseInt(values[0][i]);

                for (int j = 1; j < row.length; j++) {
                    if (Integer.parseInt(values[j][i]) > max)
                        max = Integer.parseInt(values[j][i]);
                }
                res += max + " ";

            }
            System.out.println(res);
        }
    }
}
