package utils.command;


public class CreateDollToy implements CommandForCreatingToy {
    private Toy dollToy;

    public CreateDollToy(Toy toy) {
        this.dollToy = toy;
    }

    @Override
    public String createToy() {
        return this.dollToy.createDollToy();
    }
}
