package utils.observer;

public interface Observer {
    void update();
    void setTopic(Observable topic);
    String readTheLastWrittenToyOnTheBoard();
}
