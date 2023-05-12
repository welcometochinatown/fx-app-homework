package ru.home.java2.homework.fxapphomework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea mainTextArea;
    @FXML
    public TextField mainTextField;

    public void sendMessage(ActionEvent actionEvent) {
        mainTextArea.appendText(mainTextField.getText() + "\n");
        mainTextField.clear();
    }
}