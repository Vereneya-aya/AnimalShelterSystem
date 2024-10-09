package Service;

import Model.Animal;
import Model.PackAnimals.Horse;
import Model.Pets.Cat;
import Model.Pets.Dog;

import java.time.LocalDate;

public class AnimalService {
    private Counter counter = new Counter();

    public Animal addAnimal(String type, String name, String commands, LocalDate birthDate) throws Exception {
        Animal animal = null;
        switch (type.toLowerCase()) {
            case "dog":
                animal = new Dog(name, commands, birthDate);
                break;
            case "cat":
                animal = new Cat(name, commands, birthDate);
                break;
            case "horse":
                animal = new Horse(name, commands, birthDate);
                break;
            default:
                System.out.println("Unknown animal type.");
        }

        if (animal != null) {
            counter.add();
        }
        return animal;
    }

    public int getCounter() {
        return counter.getCount();
    }
}
