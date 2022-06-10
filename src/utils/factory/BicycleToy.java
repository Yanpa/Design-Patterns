package utils.factory;

public class BicycleToy extends CreatedToy{

    protected BicycleToy(String label) {
        super(label);
        createToy(label);
    }

    @Override
    protected void createToy(String name) {
        System.out.println("Just now a kid got a new " + name);
    }
}
