package utils.factory;

import utils.observer.Observable;
import utils.observer.Observer;

public class Dwarf extends ToysFactory implements Observer {
    private Observable toy;

    public Dwarf() {

    }

    @Override
    public void update() {
        if(this.toy == null) {
            System.out.println("No topic set");
            return;
        }

        System.out.println(this.toy.getUpdate() + " was written on the board!");
    }

    @Override
    public void setTopic(Observable topic) {
        this.toy = topic;
    }

    @Override
    public String readTheLastWrittenToyOnTheBoard() {
        return this.toy.getUpdate();
    }


    @Override
    public CreatedToy createFactoryToy(String toyName) {
        if(toyName.equalsIgnoreCase("Bicycle")){
            return new BicycleToy("Bicycle");
        }

        return new DollToy("Doll");
    }
}
