package Model.Pets;

import Model.Pet;

import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(String name, String commands, LocalDate birthDate) {
        super(name, commands, birthDate);
    }
}
