package Animal;

import java.time.LocalDate;

public class Pet extends Animal {

    public Pet(String name, String commands, LocalDate birthDate) {
        super(name, commands, birthDate);
    }

    @Override
    public void addCommand(String command) {
        this.commands += ", " + command;
    }

    @Override
    public void showCommands() {
        System.out.println("Commands for " + this.name + ": " + commands);
    }
}