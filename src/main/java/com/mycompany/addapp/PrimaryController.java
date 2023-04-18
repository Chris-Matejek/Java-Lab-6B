package com.mycompany.addapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField NumberOneTextField;
    @FXML
    private TextField NumberTwoTextField;
    @FXML
    private Label SumLabel;
    @FXML
    private Button CalcualteButton;


    @FXML
    private void CalcualteButtonClicked(ActionEvent event) {
        int sum;
        sum = Integer.parseInt(NumberOneTextField.getText())
                + Integer.parseInt(NumberTwoTextField.getText());
        SumLabel.setText("" + sum);
    }
}
