class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Użytkownik " + name + " otrzymał nową wiadomość: " + message);

        if (message.contains("ważne")) {
            System.out.println("Uwaga! Ta wiadomość jest oznaczona jako ważna.");
        }

        if (message.startsWith("Przywitajmy")) {
            System.out.println("Witamy nowego użytkownika w czacie!");
        }
    }
}