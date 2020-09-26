import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import result.DataDao;

import java.util.List;

public class Stat {
  
   ObservableList<String> choices= FXCollections.observableArrayList("napi","havi");

    @FXML
    public BarChart statDiagramm;

    @FXML
    public ChoiceBox selected;

    @FXML
    public Button creator;

    private DataDao dataDao;
  
    @FXML
    private void initChoices() {
        selected.setItems(choices);
        selected.setValue(choices.get(0));
    }
  
     public void initialize(){
        dataDao = DataDao.getInstance();
        initChoices();
    }

    @FXML
    public void returnApp(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.close();
    }

}
