package methods;

public class MultiplicationTable {
    private int target;

    public MultiplicationTable(int target) {
        this.target = target;
    }

    public void resolve() {
        System.out.println("Tabela de multipliacação por " + this.target);
        for (int i = 1; i <=10 ; i++) {
            String product = this.target + " x " + i;
            int result = this.target * i;
            System.out.println(product + " = " + result);
        }
    }
}
