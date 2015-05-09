
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        byte idLastUsedPhrase = 0;
        boolean changeSymb = false;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] phrases = {", yeah!", ", this is crazy, I tell ya.",
                ", can U believe this?", ", eh?", ", aw yea.", ", yo.",
                "? No way!", ". Awesome!"};

            String res = "";
            char tmp;

            for (int i = 0; i < line.length(); i++) {
                tmp = line.charAt(i);
                if (tmp == '.' || tmp == '!' || tmp == '?') {
                    if (changeSymb) {
                        res += phrases[idLastUsedPhrase];
                        if (++idLastUsedPhrase == phrases.length) {
                            idLastUsedPhrase = 0;
                        }
                        changeSymb = false;
                    } else {
                        changeSymb = true;
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
