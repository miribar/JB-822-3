package ameedf.jb8223.lectures.b4test.operation;

public class OperationApp {
    public static void main(String[] args) {
        // 1
        Employee employee = new Employee("QA");
        System.out.println(employee.describe());
        System.out.println("From outside: " + employee.title);

        // 2
        Employee employee2 = new Manager("Developer");
        System.out.println(employee2.describe());
        System.out.println("From outside: " + employee2.title);

        // 3
        Employee employee3 = new SuperManager("Analyst");
        System.out.println(employee3.describe());
        System.out.println("From outside: " + employee3.title);

        // 4
        Manager manager = new SuperManager("Banker");
        System.out.println(manager.describe());
        System.out.println("From outside: " + manager.title);
    }
}
