public static void main(String args[]) {

        String lines = "0 0 0 0,0 1 0 5,0 5 0 2,0 5 5 5,5 5 0 5,0 5 1 6,0 5 1 4,0 0 -5 5,0 0 -5 -5";
        for (String line : lines.split(",")) {
            short O = Short.valueOf(line.split(" ")[0]);
            short P = Short.valueOf(line.split(" ")[1]);
            short Q = Short.valueOf(line.split(" ")[2]);
            short R = Short.valueOf(line.split(" ")[3]);
            String result = "";
            if (O == Q && P == R) {
                result = "here";
            } else {
                if (P < R) {
                    result = "N";
                } else if (P > R) {
                    result = "S";
                }
                if (O < Q) {
                    result += "E";
                } else if (O > Q) {
                    result += "W";
                }
            }
            System.out.println(result);
        }
    }
