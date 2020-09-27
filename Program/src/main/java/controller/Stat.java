package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import result.DataDao;

import java.util.List;

public class Stat {


    ObservableList<String> choices= FXCollections.observableArrayList("napi","havi");

    @FXML
    public  BarChart<String,Number> statDiagramm;

    @FXML
    public ChoiceBox selected;

    private DataDao dataDao;
  
    @FXML
    private void initChoices() {
        selected.getItems().addAll(choices);
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
  
    @FXML
    public void generateStat(MouseEvent mouseEvent) {
        statDiagramm.getData().clear();
        if (selected.getValue().equals("napi")){
            List<Object[]> statisticsData = dataDao.getDailyStatistic();
            setBarchar(statisticsData);
        }
        else {
            List<Object[]> statisticsData = dataDao.getMonthlyStatistic();
            setBarchar(statisticsData);
        }
    }

    private void setBarchar(List<Object[]> statisticsData) {
        XYChart.Series<String,Number> dataSeries;
        for(Object[] element : statisticsData){
            dataSeries = new XYChart.Series<>();
            dataSeries.setName(element[0].toString());
            dataSeries.getData().add(new XYChart.Data<>(element[0].toString(), Long.parseLong(element[1].toString())));
            statDiagramm.getData().addAll(dataSeries);

        }
    }

}
