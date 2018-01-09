package ameedf.jb8223.lectures.exam;

/**
 * Created by ameed_fah
 * 03/01/2018
 */
public class Q1 {
    public static void main(String[] args) {
        checkThat(31, true);
    }

    private static void checkThat(int num, boolean bool) {
        while (num++ > 0) {
            bool = !bool;
            if (bool) {
                continue;
            }
            if (num % 2 == 1 || num % 3 == 2) {
                System.out.print(num);
            }
            num /= 2;
        }
    }
}
