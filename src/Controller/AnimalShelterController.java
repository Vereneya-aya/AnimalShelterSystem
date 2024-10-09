package Controller;


import Model.Animal;
import Model.Pets.Dog;
import Model.Pets.Cat;
import Model.PackAnimals.Horse;
import View.MenuView;
import Service.AnimalService;

import java.time.LocalDate;
import java.util.Scanner;

public class AnimalShelterController {
    private AnimalService animalService;
    private MenuView menuView;

    public AnimalShelterController(AnimalService animalService, MenuView menuView) {
        this.animalService = animalService;
        this.menuView = menuView;
    }

    public void run() {
        while (true) {
            menuView.showMainMenu(); // Выводим меню
            int choice = menuView.getUserChoice(); // Получаем выбор пользователя

            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    menuView.showMessage("Animals added: " + animalService.getCounter());
                    break;
                case 3:
                    menuView.showMessage("Exiting...");
                    return;
                default:
                    menuView.showMessage("Invalid option.");
            }
        }
    }

    private void addAnimal() {
        try {
            String type = menuView.getInputString("Enter the type of animal (dog, cat, horse): ");
            String name = menuView.getInputString("Enter the name of the animal: ");
            String commands = menuView.getInputString("Enter the commands the animal knows: ");
            String dateStr = menuView.getInputString("Enter the birth date (YYYY-MM-DD): ");
            LocalDate birthDate = LocalDate.parse(dateStr);

            Animal animal = animalService.addAnimal(type, name, commands, birthDate);
            if (animal != null) {
                menuView.showMessage("Animal added: " + name);
            }
        } catch (Exception e) {
            menuView.showMessage("Error: " + e.getMessage());
        }
    }
}