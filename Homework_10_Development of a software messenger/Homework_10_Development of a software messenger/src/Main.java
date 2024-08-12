public class Main {
    public static void main(String[] args) {
        User ihor = new User("Ihor");
        User mariia = new User("Mariia");

        ihor.addContact(mariia);
        mariia.addContact(ihor);

        ihor.sendMessage(mariia, "Hi, Mariia!");
        mariia.sendMessage(ihor, "Hello, Ihor!");

        ihor.printAllMessages();
        mariia.printAllMessages();

        ihor.readMessage(ihor.getMessages().get(0));
        mariia.readMessage(mariia.getMessages().get(0));

        System.out.println("Updated message status:");
        ihor.printAllMessages();
        mariia.printAllMessages();
    }
}