package int_reverse_integer;

public class Solution {
    public static void main(String[] args) {

        System.out.println(reverseInt(232323323));

    }

    public static int reverseInt(int x) {
        int result = 0;

        while (x != 0) {
            int pop = x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            result = result * 10 +pop;
        }
        return result;
    }
}
