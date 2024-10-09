package Animals;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected String commands;
    protected LocalDate birthDate;

    public Animal(String name, String commands, LocalDate birthDate) {
        this.name = name;
        this.commands = commands;
        this.birthDate = birthDate;
    }

    public abstract void addCommand(String command);
    public abstract void showCommands();
}
