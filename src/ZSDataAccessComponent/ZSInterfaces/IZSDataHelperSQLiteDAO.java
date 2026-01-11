package ZSDataAccessComponent.ZSInterfaces;

import java.util.List;

import ZSInfrastructureComponent.ZSAppException;

public interface IZSDataHelperSQLiteDAO<T> {
    List<T> readAll()            throws ZSAppException;
    T       readBy (Integer id)  throws ZSAppException;
    boolean create (T entity)    throws ZSAppException;
    boolean update (T entity)    throws ZSAppException;
    boolean delete (Integer id)  throws ZSAppException;
    Integer getMaxReg()          throws ZSAppException;
}

