import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = Integer.parseInt(scanner.nextLine());
        if (month < 1 || month > 12) {
            System.out.println("Такого месяца не существует");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = Integer.parseInt(scanner.nextLine());
        if (day < 1 || day > 30) {
            System.out.println("Такого дня не существует.");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = Integer.parseInt(scanner.nextLine());
        if (steps < 0) {
            System.out.println("Количество шагов должно быть положительным числом.");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }
}
