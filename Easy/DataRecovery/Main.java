
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] tmp = line.split(";");
            String[] words = tmp[0].split(" ");
            String[] indexes = tmp[1].split(" ");
            String[] res = new String[words.length];

            for (int i = 0; i < words.length; i++) {
                try {
                    int indx = Integer.valueOf(indexes[i]) - 1;
                    res[indx] = words[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    for (int j = 0; j < res.length; j++) {
                        if (res[j] == null) {
                            res[j] = words[i];
                        }
                    }
                }
            }

            for (String item : res) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
