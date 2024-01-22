package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintDuplicates {
    List<String> array1 = new ArrayList<>();
    List<String> array2 = new ArrayList<>();

    public PrintDuplicates(List<String> array1, List<String> array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public void resolve() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < this.array1.size(); i++) {
            for (int j = 0; j < this.array2.size(); j++) {
                if (Objects.equals(array2.get(j), array1.get(i))) {
                    result.add(array2.get(j));
                }
            }
        }
        System.out.println(result.toString());
    }
}
