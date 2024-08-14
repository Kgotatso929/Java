interface Calculable {
    double calculate(double a, double b);

    default double performOperation(double a, double b, Operation op) {
        return op.execute(a, b);
    }

    default double sqrt(double a) {
        return Math.sqrt(a);
    }
}

interface Operation {
    double execute(double a, double b);
}

public class Main {
    public static void main(String[] args) {
        Calculable calculable = new Calculable() {
            public double calculate(double a, double b) {
                return a;
            }
        };

        Operation addition = new Operation() {
            @Override
            public double execute(double a, double b) {
                return a + b;
            }
        };

        System.out.println("Addition: " + calculable.performOperation(4, 3, addition));
    }
}

class CustomCalculableImpl implements Calculable {
    @Override
    public double calculate(double a, double b) {
        return 0;
    }

    @Override
    public double sqrt(double a) {
        System.out.println("Nested class sqrt implementation");
        return Math.sqrt(a);
    }
}