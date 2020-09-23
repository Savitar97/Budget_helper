package controller;

import javafx.scene.input.MouseEvent;
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



    public void returnLogin(MouseEvent mouseEvent) throws IOException {}
}
