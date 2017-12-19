package src.ameedf.jb8223.lectures.b4test.classes;

public class ComplicatedCalculation extends SimpleCalculation {
    int parameter;

    public ComplicatedCalculation(int parameter) {
        super(parameter);
        this.parameter = parameter + (2 * super.parameter);
    }

    public String calculate() {
        return "In ComplicatedCalculation class: " + parameter;
    }

}
