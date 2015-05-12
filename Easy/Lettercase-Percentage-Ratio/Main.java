
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            int upperCaseCount = 0, lowerCaseCount = 0;

            for (int i = 0; i < line.length(); i++) {
                if (Character.isUpperCase(line.charAt(i))) {
                    upperCaseCount++;
                } else if (Character.isLowerCase(line.charAt(i))) {
                    lowerCaseCount++;
                }
            }

            float upperCasePercent = upperCaseCount * 100 / (float) (upperCaseCount + lowerCaseCount);
            float lowerCasePercent = lowerCaseCount * 100 / (float) (upperCaseCount + lowerCaseCount);
            System.out.println("lowercase: " + String.format("%.2f", lowerCasePercent)
                    + " uppercase: " + String.format("%.2f", upperCasePercent));
        }
    }
}
