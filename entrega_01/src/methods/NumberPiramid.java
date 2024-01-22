package methods;

public class NumberPiramid {
    private int elements;

    public NumberPiramid(int elements) {
        this.elements = elements;
    }

    public void resolve() {
        for (int i = 1; i <= this.elements; i++) {
            String result = "";
            for (int j = 1; j <= i; j++) {
                result = result + i;
            }
            System.out.println(result);
        }
    }
}
