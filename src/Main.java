import utils.command.CommandForCreatingToy;
import utils.command.CreateBicycleToy;
import utils.command.CreateDollToy;
import utils.command.Toy;
import utils.factory.Dwarf;
import utils.observer.MagicBoard;
import utils.observer.Observer;
import utils.singleton.SantaClaus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SantaClaus santaClaus = SantaClaus.getSantaClausInstance();

        Toy toy = new Toy();
        MagicBoard magicBoard = new MagicBoard();
        Observer dwarfThatWatchesTheMagicBoard = new Dwarf();
        Dwarf factoryDwarf = new Dwarf();

        CommandForCreatingToy askedToy = askUserWhatToyTheyWantFromSanta(toy);

        santaClaus.setCommandForCreatingToy(askedToy);
        santaClaus.writeTheWantedToyOnTheBoard(magicBoard);

        magicBoard.setOnWatchForMagicBoardUpdates(dwarfThatWatchesTheMagicBoard);
        magicBoard.notifyDwarfs();

        factoryDwarf.createFactoryToy(dwarfThatWatchesTheMagicBoard.readTheLastWrittenToyOnTheBoard());
    }

    static CommandForCreatingToy askUserWhatToyTheyWantFromSanta(Toy returnedToy) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("What toy you want from me dear child: ");
            String toy = scanner.nextLine();

            if(toy.trim().equalsIgnoreCase("bicycle")){
                System.out.println("I'm telling the dwarf that you want a bicycle immediately");
                return new CreateBicycleToy(returnedToy);
            } else if (toy.trim().equalsIgnoreCase("doll")) {
                System.out.println("I'm telling the dwarf that you want a doll immediately");
                return new CreateDollToy(returnedToy);
            }
            else {
                System.out.println("I can't make this toy child. It has to be a toy or a bicycle");
            }
        }
    }
}