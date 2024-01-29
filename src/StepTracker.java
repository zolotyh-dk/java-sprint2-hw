import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }

//        Заполнение monthToData тестовыми данными
//        Random random = new Random();
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 30; j++) {
//                monthToData[i].days[j] = random.nextInt(20000);
//            }
//        }
    }

    void addNewNumberStepsPerDay() {
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

    void changeStepGoal() {
        System.out.println("Введите цель по количеству шагов за день.");
        int newGoal = Integer.parseInt(scanner.nextLine());
        if (newGoal <= 0) {
            System.out.println("Цель по шагам должна быть больше нуля.");
            return;
        }
        goalByStepsPerDay = newGoal;
    }

    void printStatistic() {
        System.out.println("Введите номер месяца.");
        int month = Integer.parseInt(scanner.nextLine());
        if (month < 1 || month > 12) {
            System.out.println("Такого месяца не существует.");
        }
        MonthData monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Количество пройденных шагов по дням:");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов в месяце: " + monthData.maxSteps());
        System.out.println("Среднее количество шагов: " + sumSteps / 30);
        System.out.println("Пройденная дистанция (в километрах): " + Converter.convertToKm(sumSteps));
        System.out.println("Количество сожжённых килокалорий: " + Converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
    }
}
