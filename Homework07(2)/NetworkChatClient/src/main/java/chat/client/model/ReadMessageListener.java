package chat.client.model;

public interface ReadMessageListener {

    void processReceivedMessage(String message);
}
