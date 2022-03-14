public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b);

        //calc.println.accept(c);
        // Не будет работать, потому что происходит деление на ноль.
        // Чтобы решить эту проблему, сделаем проверку на равенство нулю с помощью оператора Predicate.

        if (calc.isNotNull.test(b)) {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } else {
            System.out.println("На ноль делить нельзя");
        }
    }
}
