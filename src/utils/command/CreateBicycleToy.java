package utils.command;

public class CreateBicycleToy implements CommandForCreatingToy {
    private Toy bicycleToy;

    public CreateBicycleToy(Toy toy) {
        this.bicycleToy = toy;
    }

    @Override
    public String createToy() {
        return this.bicycleToy.createBicycleToy();
    }
}
