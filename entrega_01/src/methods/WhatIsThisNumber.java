package methods;
public class WhatIsThisNumber {
    private int number;

    public WhatIsThisNumber(int number) {
        this.number = number;
    }

    private String resolve(int number) {
        String nature = resolveOddOrPair(number);
        String signal = resolvePositiveOrNegative(number);
        return number + " é " + nature + " e " + signal + ".";
    }

    private String resolveOddOrPair(int number) {
        if (number % 2 == 0) return "par";
        return "ímpar";
    }

    private String resolvePositiveOrNegative(int number) {
        if (number < 0) return "negativo";
        return "positivo";
    }

    public String getResult() {
        return this.resolve(this.number);
    }
}
