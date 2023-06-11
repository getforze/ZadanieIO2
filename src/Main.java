public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("John");
        User user2 = new User("Alice");

        chatRoom.addObserver(user1);
        chatRoom.addObserver(user2);

        chatRoom.sendMessage("Cześć wszystkim!");

        chatRoom.removeObserver(user2);

        chatRoom.sendMessage("Miło cię widzieć, John!");
    }
}
