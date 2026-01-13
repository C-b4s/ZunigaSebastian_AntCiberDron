package ZSDataAccessComponent.ZSDAO;

import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSDataAccessComponent.ZSDTOs.ZSSexoDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSSexoDAO extends ZSDataHelperSQLiteDAO<ZSSexoDTO>{
    public ZSSexoDAO(Class<ZSSexoDTO> ZSDtoClass, String ZSTableName, String ZSTablePK) throws ZSAppException {
        super(ZSSexoDTO.class, "zsSexo", "zsIdSexo");
    }

}
