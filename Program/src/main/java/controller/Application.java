package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.App;
import result.DataDao;
import result.model.DataModel;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.EventObject;
import java.util.List;

public class Application {

    @FXML
    public Label userNameLabel;
    @FXML
    public Label totalPos;
    @FXML
    public Label totalNeg;
    @FXML
    public Label totalVal;
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

    public void initialize() {
        dataDao = DataDao.getInstance();
        setGraphic();
    }
    @FXML
    public void setTotalPos(Long value) {
        if (value != null) {
            this.totalPos.setText(value.toString() + " Ft");
        } else this.totalPos.setText("0 Ft");
    }
    @FXML
    public void setTotalNeg(Long value) {
        if (value != null) {
            this.totalNeg.setText(value.toString() + " Ft");
        } else this.totalNeg.setText("0 Ft");
    }

    @FXML
    public void setTotalVal(Long value) {
        if (value != null) {
            this.totalVal.setText(value.toString() + " Ft");
        } else this.totalVal.setText("0 Ft");
    }

    @FXML
    public void setGraphic() {
        List<DataModel> dataList = dataDao.findAll();
        System.out.println(dataList);
        username.setCellValueFactory(new PropertyValueFactory<>("username"));
        created.setCellValueFactory(new PropertyValueFactory<>("created"));
        amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        description.setCellValueFactory(new PropertyValueFactory<>("description"));
        comment.setCellValueFactory(new PropertyValueFactory<>("comment"));
        created.setCellFactory(column -> {
            TableCell<DataModel, ZonedDateTime> cell = new TableCell<DataModel, ZonedDateTime>() {
                private DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

                @Override
                protected void updateItem(ZonedDateTime item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setText(null);
                    } else {
                        setText(item.format(formatter));
                    }
                }
            };
            return cell;
        });

        ObservableList<DataModel> observableResult = FXCollections.observableArrayList();
        observableResult.addAll(dataList);
        dataTable.setItems(observableResult);
        setTotalPos(dataDao.totalPositiveValue());
        setTotalNeg(dataDao.totalNegativeValue());
        setTotalVal(dataDao.totalValue());
    }
    @FXML
    public void setUsername(String username) {
        userNameLabel.setText(username);
    }

    @FXML
    public void returnLogin(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/launch.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    public void goToAdd(MouseEvent mouseEvent) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/add.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<Add>getController().setUsername(userNameLabel.getText());
            Add controller = fxmlLoader.getController();
            controller.setApp(this);
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void removeSelected(MouseEvent mouseEvent) {
        try {
            dataDao.remove(dataTable.getSelectionModel().getSelectedItem());
            setGraphic();
        } catch (Exception e) {
            throw new IllegalStateException();
        }

    }
    @FXML
    public void goToModify(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/modify.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<Modify>getController().setDataModel(dataTable.getSelectionModel().getSelectedItem());
            Modify controller = fxmlLoader.getController();
            controller.setApp(this);
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void goToStat(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/statistics.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root, 1024, 768));
        stage.show();
    }
}
