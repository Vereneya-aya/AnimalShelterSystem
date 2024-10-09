package Animal;

public class PackAnimal extends Animal {

    public PackAnimal(String name, String commands, LocalDate birthDate) {
        super(name, commands, birthDate);
    }

    @Override
    public void addCommand(String command) {
        this.commands += ", " + command;
    }

    @Override
    public void showCommands() {
        System.out.println("Commands for pack animal " + this.name + ": " + commands);
    }
}
