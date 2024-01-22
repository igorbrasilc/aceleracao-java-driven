package methods;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private int total;
    private List<Number> sequence = new ArrayList<>();

    public Fibonacci(int total) {
        this.total = total;
    }

    public String resolveSequence() {
        int fn1 = 0;
        int fn2 = 1;
        this.sequence.add(fn1);
        this.sequence.add(fn2);

        int nextFibonnaci;
        for (int i = 2; i < this.total; i++) {
            nextFibonnaci = fn1 + fn2;
            this.sequence.add(nextFibonnaci);
            fn1 = fn2;
            fn2 = nextFibonnaci;
        }
        return this.sequence.toString();
    }
}
