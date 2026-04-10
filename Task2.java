public class Task2<T extends Number> {
    private T value;

    public Task2(T value) {
        this.value = value;
    }

    public double getReciprocal() {
        return 1.0 / value.doubleValue();
    }

    public double getFractionalPart() {
        double val = value.doubleValue();
        return val - (long) val;
    }

    public static <U extends Number, V extends Number> boolean absEquals(U first, V second) {
        return Math.abs(first.doubleValue()) == Math.abs(second.doubleValue());
    }

    public static void main(String[] args) {
        Task2<Double> doubleNum = new Task2<>(9.76);
        Task2<Integer> intNum = new Task2<>(-5);

        System.out.println("Reciprocal");
        System.out.println("Reciprocal of 9.76: " + doubleNum.getReciprocal());
        System.out.println("\nFractional Part");
        System.out.println("Fractional part of 9.76: " + doubleNum.getFractionalPart());
        System.out.println("\nAbsolute Equality");
        Double d = 5.0;
        Integer i = -5;
        boolean isEqual = absEquals(d, i);
        System.out.println("Is abs(" + d + ") equal to abs(" + i + ")? " + isEqual);
    }
}