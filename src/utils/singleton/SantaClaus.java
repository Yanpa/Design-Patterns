package utils.singleton;

import utils.command.CommandForCreatingToy;
import utils.observer.MagicBoard;

public class SantaClaus {
    private static SantaClaus santaClaus;
    private final String name;
    private final int age;
    private CommandForCreatingToy commandForCreatingToy;

    private SantaClaus() {
        this.age = 100;
        this.name = "Santa Claus";
    }

    public static SantaClaus getSantaClausInstance() {
        if(santaClaus == null) {
            santaClaus = new SantaClaus();
        }

        return santaClaus;
    }

    public CommandForCreatingToy getCommandForCreatingToy() {
        return commandForCreatingToy;
    }

    public void setCommandForCreatingToy(CommandForCreatingToy commandForCreatingToy) {
        this.commandForCreatingToy = commandForCreatingToy;
    }

    public void writeTheWantedToyOnTheBoard(MagicBoard magicBoard) {
        if(this.commandForCreatingToy == null) {
            System.out.println("Santa has not given the dwarfs a toy request yet");
            return;
        }

        magicBoard.setTopic(this.commandForCreatingToy.createToy());
    }
}
