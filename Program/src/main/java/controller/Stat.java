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

}
