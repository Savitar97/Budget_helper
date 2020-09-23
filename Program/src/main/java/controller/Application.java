package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import result.DataDao;
import result.model.DataModel;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;

public class Application {

    @FXML
    public Label userNameLabel;
    @FXML
    private TableColumn<DataModel, Long> id;
    @FXML
    private TableView<DataModel> dataTable;
    @FXML
    private TableColumn<DataModel, String> username;
    @FXML
    private TableColumn<DataModel, ZonedDateTime> created;
    @FXML
    private TableColumn<DataModel, Long> amount;
    @FXML
    private TableColumn<DataModel, String> description;
    @FXML
    private TableColumn<DataModel, String> comment;
    
    private DataDao dataDao;

    public void initialize(){
        dataDao=DataDao.getInstance();
        updateTable();
    }

    public void updateTable(){
        List<DataModel> dataList=dataDao.findAll();
    }

    public void setUsername(String username) {
        userNameLabel.setText(username);
    }


    public void returnLogin(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/launch.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
