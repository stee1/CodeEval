import java.io.*;

public class Main {

    public static int calcZeroCount (String input, int count) {
        int i = input.indexOf("0");

        if (i > -1) {
            count = calcZeroCount(input.substring(i+1), ++count);
        }

        return count;
    }

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] values = line.split(" ");
            int zeroCount = Integer.valueOf(values[0]);
            int range = Integer.valueOf(values[1]);
            int matchesCount = 0;

            String[] bytes = new String[range+1];
            for (int i=1; i<=range; i++) {
                bytes[i] = Integer.toBinaryString(i);
                String s = Integer.toBinaryString(i);
                int z = calcZeroCount(s, 0);
                if (z == zeroCount)
                    matchesCount++;
            }

            System.out.println(matchesCount);
        }
    }
}
