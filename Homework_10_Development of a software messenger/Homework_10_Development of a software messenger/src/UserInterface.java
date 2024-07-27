import java.util.List;

public interface UserInterface {
    String getName();
    List<User> getContacts();
    List<Message> getMessages();
    void addContact (User user);
    void sendMessage (User recipient, String text);
    void receiveMessage (Message message);
}