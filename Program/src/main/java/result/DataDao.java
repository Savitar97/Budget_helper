package result;

import jpa.GenericJPADao;
import result.model.DataModel;

import javax.persistence.Persistence;
import java.util.List;

public class DataDao extends GenericJPADao<DataModel> {
    private static DataDao instance;

    private DataDao() {
        super(DataModel.class);
    }
    
    public static DataDao getInstance() {
        if (instance == null) {
            instance = new DataDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("budgetunit").createEntityManager());
        }
        return instance;
    }
}
