package ameedf.jb8223.lectures.b4test.classes;

public class SimpleCalculation extends Calculation {
    int parameter;

    public SimpleCalculation(int parameter) {
        super(parameter);
        this.parameter = parameter + super.parameter;
    }

    public String calculate() {
        return "In SimpleCalculation class: " + parameter;
    }

}
