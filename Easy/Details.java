public static void main(String args[]) {

        String line = "XXYY,X..Y,XX.Y";
        String[] strings = line.split(",");
        byte res = (byte) strings[0].length();

        for (String item : strings) {
            byte steps = 0;
            byte searchIndex = (byte) (item.indexOf("Y") - 1);
            while (item.charAt(searchIndex) != 'X') {
                searchIndex--;
                steps++;
            }
            if (res > steps) {
                res = steps;
            }
        }
        System.out.println(res);
    }
