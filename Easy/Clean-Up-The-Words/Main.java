import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String res = "";

            for (int i=0; i<line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isLetter(c)) {
                    do {
                        res += c;
                        if (i<line.length()-1) {
                            i++;
                            c = line.charAt(i);
                        }
                        else break;
                    }
                    while (Character.isLetter(c));
                    res += ' ';
                }
            }

            System.out.println(res.toLowerCase());
        }
    }
}
