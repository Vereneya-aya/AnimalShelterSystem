package Controller;

import Model.Animal;
import Service.AnimalService;

import java.time.LocalDate;
import java.util.Scanner;

public class AnimalShelter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalService animalService = new AnimalService();

        while (true) {
            System.out.println("Welcome to the Animal Shelter! Choose an option:");
            System.out.println("1. Add new animal");
            System.out.println("2. Show counter");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter the type of animal (dog, cat, horse): ");
                        String type = scanner.nextLine();
                        System.out.println("Enter the name of the animal: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter the commands the animal knows: ");
                        String commands = scanner.nextLine();
                        System.out.println("Enter the birth date (YYYY-MM-DD): ");
                        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

                        Animal animal = animalService.addAnimal(type, name, commands, birthDate);

                        if (animal != null) {
                            System.out.println("Animal added: " + name);
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Animals added: " + animalService.getCounter());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}