package ameedf.jb8223.lectures.b4test.plus;

/**
 * Created by ameed_fah
 * 18/12/2017
 */
public class PlusPlusApp {
    public static void main(String[] args) {
        whatWillBeTheResultOf(50, true);
    }

    private static void whatWillBeTheResultOf(int number, boolean condition) {
        while (number-- > 0) {
            condition = !condition;
            if (condition) {
                if (number > 10) {
                    number -= 10;
                } else {
                    number /= 2;
                }
                continue;
            }
            if (number % 3 == 1 || number % 2 != 1) {
                System.out.print(number);
            }
            number /= 2;
        }
    }
}
