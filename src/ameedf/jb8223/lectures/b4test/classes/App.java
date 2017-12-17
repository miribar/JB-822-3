package ameedf.jb8223.lectures.b4test.classes;

public class App {
    public static void main(String[] args) {
        // 1
        Calculation calculation = new Calculation(2);
        System.out.println(calculation.calculate());
        System.out.println("From outside: " + calculation.parameter);

        // 2
        Calculation calculation2 = new SimpleCalculation(2);
        System.out.println(calculation2.calculate());
        System.out.println("From outside: " + calculation2.parameter);

        // 3
        Calculation calculation3 = new ComplicatedCalculation(2);
        System.out.println(calculation3.calculate());
        System.out.println("From outside: " + calculation3.parameter);

        // 4
        SimpleCalculation calculation4 = new ComplicatedCalculation(2);
        System.out.println(calculation4.calculate());
        System.out.println("From outside: " + calculation4.parameter);

    }
}
