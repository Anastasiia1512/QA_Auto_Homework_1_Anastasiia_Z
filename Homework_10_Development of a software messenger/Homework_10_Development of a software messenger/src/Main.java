public class Main {
    public static void main(String[] args) {
        User ihor = new User("Ihor");
        User mariia = new User("Mariia");

        ihor.addContact(mariia);
        mariia.addContact(ihor);

        ihor.sendMessage(mariia, "Hi, Mariia!");
        mariia.sendMessage(ihor, "Hello, Ihor!");

        System.out.println("Ihor's messages:");
        for (Message message : ihor.getMessages()) {
            System.out.println("From " + message.getSender().getName() + ": " + message.getText() + " - Status: " + message.getStatus());
        }
        System.out.println("Mariia's messages:");
        for (Message message : mariia.getMessages()) {
            System.out.println("From " + message.getSender().getName() + ": " + message.getText() + " - Status: " + message.getStatus());
        }
        if (!ihor.getMessages().isEmpty()) {
            ihor.readMessage(ihor.getMessages().get(0));
        }
        System.out.println("Ihor's messages after reading:");
            for (Message message : ihor.getMessages()) {
                System.out.println("From " + message.getSender().getName() + ": " + message.getText() + " - Status: " + message.getStatus());
            }
    }
}