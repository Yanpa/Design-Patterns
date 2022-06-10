package utils.factory;

public abstract class CreatedToy {
    String label;

    protected CreatedToy(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    protected abstract void createToy(String name);
}
