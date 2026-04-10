public class Pair<L, R> {
    private final L left;
    private final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair{" + left + ", " + right + "}";
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        Pair<Double, Double> pair2 = new Pair<>(10.5, 20.0);
        System.out.println(pair1);
        System.out.println("Left: " + pair1.getLeft());
        System.out.println("Right: " + pair1.getRight());
        System.out.println(pair2);
        System.out.println("Left: " + pair2.getLeft());
        System.out.println("Right: " + pair2.getRight());
    }
}