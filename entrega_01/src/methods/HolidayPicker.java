package methods;

import java.util.HashMap;
import java.util.Map;

public class HolidayPicker {
    private Map<String, String> holidays = new HashMap<>();

    public HolidayPicker() {
        this.holidays.put("01-01-2024", new String("Confraternização Mundial"));
        this.holidays.put("12-02-2024", new String("Carnaval"));
        this.holidays.put("13-02-2024", new String("Carnaval"));
        this.holidays.put("29-03-2024", new String("Sexta-feira Santa"));
    }

    public void resolveHoliday(String date) {
        if (this.holidays.containsKey(date)) {
            System.out.println("Dia " + date + " é " + this.holidays.get(date) + " 🎉");
        } else {
            System.out.println("Dia " + date + " não é feriado 🥲");
        }
    }
}
