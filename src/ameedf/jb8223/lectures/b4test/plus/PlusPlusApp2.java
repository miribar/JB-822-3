package ameedf.jb8223.lectures.b4test.plus;

/**
 * Created by ameed_fah
 * 19/12/2017
 */
public class PlusPlusApp2 {
    public static void main(String[] args) {
        new PlusPlusApp2().doSomething(3, 40);
    }

    private void doSomething(int num1, int num2) {
        String a = "";
        while (++num1 < 50) {
            if (num2-- % 3 != 1) {
                num1 += num2 / 3;
                System.out.println("A");
                continue;
            }
            System.out.println("B");
            int tmp = num1;
            num1 = num2;
            num2 = tmp * 2;
            a += num1 + " ";
        }
        System.out.println(a);
    }
}
