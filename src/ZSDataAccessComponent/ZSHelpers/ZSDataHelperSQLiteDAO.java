package ZSDataAccessComponent.ZSHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import ZSDataAccessComponent.ZSInterfaces.IZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppConfig;
import ZSInfrastructureComponent.ZSAppException;
    
public class ZSDataHelperSQLiteDAO<T> implements IZSDataHelperSQLiteDAO<T>{
    protected final Class<T> ZSDTOClass;
    protected final String  ZSTableName;
    protected final String  ZSTablePK;

    private static final String ZSDBPath = ZSAppConfig.ZSDATABASE; 
    private static Connection conn = null;

    protected static synchronized Connection openConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(ZSDBPath);
        }
        return conn;
    }

    protected static void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

    protected String getDataTimeNow() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }


    public ZSDataHelperSQLiteDAO(Class<T> ZSDtoClass, String ZSTableName, String ZSTablePK) throws ZSAppException {
        try {
            openConnection();
        } catch (SQLException e) {
            throw new ZSAppException(e, getClass(), "DataHelperSQLiteDAO");
        }
        this.ZSDTOClass  = ZSDtoClass;
        this.ZSTableName = ZSTableName;
        this.ZSTablePK   = ZSTablePK;
    }

    @Override
    public List<T> zsReadAll() throws ZSAppException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    @Override
    public T zsReadBy(Integer id) throws ZSAppException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readBy'");
    }

    @Override
    public boolean zsCreate(Object entity) throws ZSAppException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public boolean zsUpdate(Object entity) throws ZSAppException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean zsDelete(Integer id) throws ZSAppException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Integer zsGetMaxReg() throws ZSAppException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zsGetMaxReg'");
    }

}
