package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button hello;
    @FXML
    private Button bye;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize() {
        hello.setDisable(true);
        bye.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(hello)) {
            System.out.println("Hello, " + nameField.getText());
        } else if(e.getSource().equals(bye)) {
            System.out.println("Bye, " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            ourLabel.setText("We did something");
                        }
                    });
                } catch (InterruptedException event) {
                    // we don't care about this
                }
            }
        };

        new Thread(task).start();

        if (ourCheckBox.isSelected()) {
            nameField.clear();
            hello.setDisable(true);
            bye.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean diableButtons = text.isEmpty() | text.trim().isEmpty();
        hello.setDisable(diableButtons);
        bye.setDisable(diableButtons);
    }

    @FXML
    public void handleChange() {
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }




}
