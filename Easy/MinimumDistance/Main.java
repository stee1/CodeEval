
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] adresses = line.split(" ");
            byte F = Byte.valueOf(adresses[0]);
            short[] A = new short[F];
            for (byte i = 0; i < F; i++) {
                A[i] = Short.valueOf(adresses[i + 1]);
            }
            Arrays.sort(A);
            short min_address = A[0];
            short max_address = A[A.length - 1];
            int min_distance = 1000000;
            for (int i = min_address; i <= max_address; i++) {
                int distance = get_distance(A, i);
                if (distance < min_distance)
                    min_distance = distance;
            }
            System.out.println(min_distance);
        }
    }
    
    static int get_distance(short[] adreses, int index) {
        int distance = 0;
        for (int i = 0; i < adreses.length; i++) {
            distance += Math.abs(adreses[i] - index);
        }
        return distance;
    }
}
