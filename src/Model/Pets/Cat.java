package Model.Pets;

import Model.Pet;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String name, String commands, LocalDate birthDate) {
        super(name, commands, birthDate);
    }
}
