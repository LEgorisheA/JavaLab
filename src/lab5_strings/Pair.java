package lab5_strings;

public class Pair {
    private int A;
    private String B;

    public Pair(int A, String B) {
        this.A = A;
        this.B = B;
    }

    public int getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    @Override
    public String toString() {
        return Integer.toString(A) + B;
    }
}
