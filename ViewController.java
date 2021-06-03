package Homework;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.text.DateFormat;
import java.util.Date;

public class ViewController {

    @FXML
    private TextArea chatHistory;
    @FXML
    private TextArea messageTextArea;

    @FXML
    private void sendMessage() {
        chatHistory.appendText(DateFormat.getDateTimeInstance().format(new Date()));
        chatHistory.appendText(System.lineSeparator());
        chatHistory.appendText("User" + ": ");
        chatHistory.appendText(messageTextArea.getText());
        chatHistory.appendText(System.lineSeparator());
        chatHistory.appendText("------");
        chatHistory.appendText(System.lineSeparator());
        messageTextArea.clear();
    }

    @FXML
    public void sendTextAreaMessage(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            if (event.isShiftDown()) {
                messageTextArea.appendText(System.lineSeparator());
            } else {
                sendMessage();
            }
        }
    }

}
