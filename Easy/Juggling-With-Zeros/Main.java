
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] inValue = line.split(" ");
            String binaryResult = "";

            for (int i = 0; i < inValue.length - 1; i += 2) {
                if (inValue[i].equals("0")) {
                    binaryResult += inValue[i + 1];
                } else {
                    for (int j = 0; j < inValue[i + 1].length(); j++) {
                        binaryResult += "1";
                    }
                }
            }

            System.out.println(Long.parseLong(binaryResult, 2));

        }
    }
}
