package View;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner;

    public MenuView() {
        this.scanner = new Scanner(System.in);
    }

    // Метод для отображения меню
    public void showMainMenu() {
        System.out.println("Welcome to the Animal Shelter! Choose an option:");
        System.out.println("1. Add new animal");
        System.out.println("2. Show animal counter");
        System.out.println("3. Exit");
    }

    // Метод для получения выбора пользователя
    public int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Метод для запроса строкового ввода от пользователя
    public String getInputString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    // Метод для запроса числового ввода от пользователя
    public int getInputInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Метод для отображения сообщений
    public void showMessage(String message) {
        System.out.println(message);
    }
}
