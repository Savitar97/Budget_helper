package controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import result.DataDao;
import result.model.DataModel;

public class Modify {
    @FXML
    public TextField modifyamount;
    @FXML
    public TextField modifydescription;
    @FXML
    public TextField modifycomment;

    private Application app;

    private static DataModel modifymodel;

    public void initialize(){
        dataDao= DataDao.getInstance();


    }
    private DataDao dataDao;

    public void setDataModel(DataModel mod) {
        modifymodel = mod;
    }

    public void returnApp(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void setApp(Application app) {
        this.app = app;
    }

    public void modifyTable(MouseEvent mouseEvent) {
        try {
            long osszeg=Long.parseLong(modifyamount.getText());
            modifymodel.setAmount(osszeg);
            modifymodel.setComment(modifycomment.getText());
            modifymodel.setDescription(modifydescription.getText());
            dataDao.update(modifymodel);
            app.setGraphic();
            Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.close();
        }
        catch (Exception e){
            throw  new IllegalArgumentException();
        }
    }
}
