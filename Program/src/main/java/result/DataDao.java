package result;

import jpa.GenericJPADao;
import result.model.DataModel;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
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
    
    public List<DataModel> findAll() {
        return entityManager.createQuery("SELECT r FROM DataModel r order by r.created DESC", DataModel.class)
                .getResultList();
    }

    public Long totalPositiveValue() {
        return entityManager.createQuery("SELECT SUM(l.amount) FROM DataModel l WHERE l.amount>0", Long.class).getSingleResult();
    }

    public Long totalNegativeValue() {
        return entityManager.createQuery("SELECT SUM(l.amount) FROM DataModel l WHERE l.amount<0", Long.class).getSingleResult();
    }
    public Long totalValue() {
        return entityManager.createQuery("SELECT SUM(l.amount) FROM DataModel l", Long.class).getSingleResult();
    }
}
