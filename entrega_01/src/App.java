import java.util.Arrays;
import java.util.List;

import methods.Fibonacci;
import methods.HolidayPicker;
import methods.MultiplicationTable;
import methods.NumberPiramid;
import methods.PrintDuplicates;
import methods.WhatIsThisNumber;

public class App {
    public static void main(String[] args) throws Exception {
        String whatIsThisNumber = whatIsThisNumber(-10);
        System.out.println(whatIsThisNumber);
        String fibonacci = resolveFibonacci(8);
        System.out.println(fibonacci);
        resolveMultiplicationTable(5);
        resolvePiramid(5);
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};
        resolveDuplicates(array1, array2);
        resolveHoliday("01-12-2024");
    }

    private static String whatIsThisNumber(int number) {
        WhatIsThisNumber problem = new WhatIsThisNumber(number);
        return problem.getResult();
    };

    private static String resolveFibonacci(int total) {
        Fibonacci problem = new Fibonacci(total);
        return problem.resolveSequence();
    }

    private static void resolveMultiplicationTable(int target) {
        MultiplicationTable multiplicationTable = new MultiplicationTable(target);
        multiplicationTable.resolve();
    }

    private static void resolvePiramid(int elements) {
        NumberPiramid numberPiramid = new NumberPiramid(elements);
        numberPiramid.resolve();
    }

    private static void resolveDuplicates(String[] array1, String[] array2) {
        PrintDuplicates printDuplicates = new PrintDuplicates(Arrays.asList(array1), Arrays.asList(array2));
        printDuplicates.resolve();
    }

    private static void resolveHoliday(String date) {
        HolidayPicker holidayPicker = new HolidayPicker();
        holidayPicker.resolveHoliday(date);
    }
}
