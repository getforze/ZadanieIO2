import java.util.ArrayList;
import java.util.List;

class ChatRoom {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void sendMessage(String message) {
        System.out.println("Wysyłanie wiadomości: " + message);
        notifyObservers(message);
    }
}