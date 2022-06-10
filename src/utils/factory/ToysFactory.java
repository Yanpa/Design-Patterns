package utils.factory;

public abstract class ToysFactory {
    public abstract CreatedToy createFactoryToy(String toyName);

    public CreatedToy produceWantedToy(String toyName) {
        CreatedToy createdToy = createFactoryToy(toyName);
        createdToy.createToy(toyName);

        return createdToy;
    }

}
