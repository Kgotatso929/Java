interface Calculable {
    double calculate(double a, double b);
    default double performOperation(double a, double b, Operation op) {
        return op.execute(a, b);
    }
}

interface Operation {
    double execute(double a, double b);
}

public class Main {
    private static class AdditionOperation implements Operation {
        @Override
        public double execute(double a, double b) {
            return a + b;
        }
    }

    private static class CustomCalculable implements Calculable {
        @Override
        public double calculate(double a, double b) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculable calculable = new CustomCalculable();

        Operation addition = new AdditionOperation();
        System.out.println("Addition: " + calculable.performOperation(5, 3, addition));

        Main.AdditionOperation add = new Main.AdditionOperation();
        System.out.println("Execute: " + add.execute(5, 10));
    }
}