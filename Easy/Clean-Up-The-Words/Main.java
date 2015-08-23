import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String res = "";
            char[] input = line.toCharArray();

            for (int i=0; i<input.length-1; i++) {
                if (Character.isLetter(input[i])) {
                    res += input[i];
                    if (!Character.isLetter(input[i+1]))
                        res += " ";
                }
            }

            System.out.println(res.toLowerCase());
        }
    }
}
