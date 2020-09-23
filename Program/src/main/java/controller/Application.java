package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import result.DataDao;
import result.model.DataModel;

import java.io.IOException;
import java.util.List;

public class Application {

    private DataDao dataDao;

    public void initialize(){
        dataDao=DataDao.getInstance();
        updateTable();
    }

    public void updateTable(){
        List<DataModel> dataList=dataDao.findAll();
    }

    public void setUsername(String username) {

    }


    public void returnLogin(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/launch.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
