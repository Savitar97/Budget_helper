package controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import result.DataDao;
import result.model.DataModel;

public class Add {
    @FXML
    public TextField amount;
    @FXML
    public TextField description;
    @FXML
    public TextField comment;

    private DataDao dataDao;

    private String user;

    private Application app;

    public void setApp(Application app) {
        this.app = app;
    }

    public void addTable(MouseEvent mouseEvent) {
        try {
            long osszeg=Long.parseLong(amount.getText());
            DataModel mod= DataModel.builder()
                    .username(user)
                    .amount(osszeg)
                    .description(description.getText())
                    .comment(comment.getText())
                    .build();
            dataDao.persist(mod);
            app.setGraphic();
            Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.close();
        }
        catch (Exception e){
           Alert alert = new Alert(AlertType.ERROR);
           alert.setTitle("Hiba");
           alert.setHeaderText(null);
           alert.setContentText("A bemenő adat csak szám lehet");
           alert.showAndWait();
           throw new IllegalArgumentException();
        }

    }


    public void initialize(){
        dataDao=DataDao.getInstance();

    }
    public void returnApp(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void setUsername(String text) {
         this.user = text;
    }
}
