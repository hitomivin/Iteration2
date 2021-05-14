package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class Controller {
    public Label cprLabel;
    public TextField cprText;
    public Button buttonSearch;


    public void onSearchPatient(ActionEvent actionEvent) {
        String CPR = cprText.getText().trim();

        // validate CPR
        if (!DataValidator.isValidCPR(CPR)) {
            // CPR er forkert
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Det CPR er forkert");
            alert.show();
        } else {
            System.out.println("korrekt");
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setContentText("Det CPR er korrekt");
            info.show();
        }

    }

}
