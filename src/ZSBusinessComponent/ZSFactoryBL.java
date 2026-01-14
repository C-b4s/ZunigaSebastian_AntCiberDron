package ZSBusinessComponent;

import java.util.List;

import ZSDataAccessComponent.ZSInterfaces.IZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSFactoryBL <T> {
    private final IZSDataHelperSQLiteDAO<T> zsODAO;

    public ZSFactoryBL(Class<? extends IZSDataHelperSQLiteDAO<T>> classDAO) {
        try {
            this.zsODAO = classDAO.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            ZSAppException er = new ZSAppException("Error al instanciar classDAO<T>", e, getClass(), "FactoryBL(...)");
            throw new RuntimeException(er);
        }
    }

    // Constructor que usa un Supplier para crear la instancia de T
    // public FactoryBL(Supplier<IZSDataHelperSQLiteDAO<T>> supplier) {
    //     this.zsODAO = supplier.get(); 
    // }
 
    public List<T> getAll() throws ZSAppException {
         return zsODAO.zsReadAll();
    }

    public T getBy(Integer zsId) throws ZSAppException {
        return zsODAO.zsReadBy(zsId);
    }

    public boolean add(T zsOT) throws ZSAppException {
        return zsODAO.zsCreate(zsOT);
    }

    public boolean upd(T zsOT) throws ZSAppException {
        return zsODAO.zsUpdate(zsOT);
    }

    public boolean del(Integer zsId) throws ZSAppException {
        return zsODAO.zsDelete(zsId);
    }
}
