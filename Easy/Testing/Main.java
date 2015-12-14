import java.io.*;

public class Main {
    private static final String LOW = "Low";
    private static final String MEDIUM = "Medium";
    private static final String HIGH = "High";
    private static final String CRITICAL = "Critical";
    private static final String DONE = "Done";


    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] values = line.split("\\|");
            values[0] = values[0].trim();
            values[1] = values[1].trim();

            int errors = 0;
            int smallerStringSize = values[0].length() < values[1].length() ? values[0].length() : values[1].length();
            for (int i=0; i<smallerStringSize; i++) {
                if (values[0].charAt(i) != values[1].charAt(i))
                    errors++;
            }
            if (values[0].length() != values[1].length())
                errors += Math.abs(values[0].length() - values[1].length());

            if (errors == 0)
                System.out.println(DONE);
            else if (errors <= 2)
                System.out.println(LOW);
            else if (errors <= 4)
                System.out.println(MEDIUM);
            else if (errors <= 6)
                System.out.println(HIGH);
            else
                System.out.println(CRITICAL);
        }
    }
}
