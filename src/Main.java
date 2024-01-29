import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                //TODO: Ввод количества шагов за определенный день
            } else if (command == 2) {
                //TODO: Изменить цель по количеству шагов в день
            } else if (command == 3) {
                //TODO: Напечатать статистику за определённый месяц
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Команда \"" + command + "\" не предусмотрена.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("0 - Выйти из приложения");
    }
}
