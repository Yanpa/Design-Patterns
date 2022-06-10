package utils.observer;

public interface Observable {
    void setOnWatchForMagicBoardUpdates(Observer observer);

    void notifyDwarfs();
    String getUpdate();
}
