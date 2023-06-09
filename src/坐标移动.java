public class 坐标移动 {
    public static void main(String[] args) {
        String s = "A10;S20;W10;D30;X;A1A;B10A11;;A10;";
        System.out.printf(a(s));
    }

    public static String a(String input) {
        String[] split = input.split(";");
        int[] ints = new int[2];
        for (String s : split) {
            if (legal(s)) {
                int[] unit = unit(s);
                ints[0] += unit[0];
                ints[1] += unit[1];
            }
        }
        String result = "(" + ints[0] + ", " + ints[1] + ")";
        return result;
    }

    public static boolean legal(String coor) {
        char[] chars = coor.toCharArray();
        if (chars == null || chars.length <= 1 || chars.length > 3) {
            return false;
        }
        if (chars[0] != 'A' && chars[0] != 'D' && chars[0] != 'W' && chars[0] != 'S') {
            return false;
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static int[] unit(String unit) {
        char[] chars = unit.toCharArray();
        int num = 0;
        char dir = chars[0];
        int xx = 0;
        int yy = 0;
        if (dir == 'A') {
            xx = -1;
        }
        if (dir == 'D') {
            xx = 1;
        }
        if (dir == 'W') {
            yy = 1;
        }
        if (dir == 'S') {
            yy = -1;
        }
        for (int i = 1; i < chars.length; i++) {
            num = num * 10 + Integer.parseInt(String.valueOf(chars[i]));
        }
        int[] ints = new int[2];
        ints[0] = xx * num;
        ints[1] = yy * num;
        return ints;
    }
}
