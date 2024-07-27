import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements UserInterface {
    private String name;
    private Set<User> contacts;
    private List<Message> messages;

    public User(String name){
        this.name=name;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public List<User> getContacts(){
        return new ArrayList<>(contacts);
    }
    @Override
    public List<Message> getMessages(){
        return messages;
    }
    @Override
    public void addContact(User user) {
        contacts.add(user);
    }
    @Override
    public void sendMessage(User recipient, String text) {
        if (contacts.contains(recipient)) {
            Message message = new Message(this, recipient, text, MessageStatus.SENT);
            recipient.receiveMessage(message);
        }
    }
        @Override
        public void receiveMessage (Message message){
            if (contacts.contains(message.getSender())) {
                messages.add(message);
                message.setStatus(MessageStatus.RECEIVED);
            }
        }
        public void readMessage (Message message){
            if (messages.contains(message) && message.getStatus() == MessageStatus.RECEIVED) {
                message.setStatus(MessageStatus.READ);
            }
        }
    }


