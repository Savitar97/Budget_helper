package controller;

import antlr.CharScanner;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Launch {
  
    @FXML
    public TextField usernameTextField;
    @FXML
    public Label errorLabel;
  
    public void runAction(MouseEvent mouseEvent) throws IOException {

        if (usernameTextField.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
        }
        else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/application.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<Application>getController().setUsername(usernameTextField.getText());
            Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}
