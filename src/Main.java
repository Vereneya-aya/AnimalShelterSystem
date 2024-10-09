import Controller.AnimalShelterController;
import Service.AnimalService;
import View.MenuView;

public class Main {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService(); // Бизнес-логика
        MenuView menuView = new MenuView(); // Интерфейс
        AnimalShelterController controller = new AnimalShelterController(animalService, menuView); // Контроллер

        controller.run(); // Запуск программы
    }
}