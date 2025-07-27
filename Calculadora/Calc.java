public class Calc {

    Calc() {

    }

    public static double somarNumeros(double a, double b) {
        return (a + b);
    }

    public static double subtrairNumeros(double a, double b) {
        return a - b;
    }

    public static double multiplicarNumeros(double a, double b) {
        return a * b;
    }

    public static double dividirNumeros(double a, double b) {
        if (b == 0) {
            System.out.println("Não é possivel dividir por zero");
            return 0;
        } else {
            return a / b;
        }
    }

}
