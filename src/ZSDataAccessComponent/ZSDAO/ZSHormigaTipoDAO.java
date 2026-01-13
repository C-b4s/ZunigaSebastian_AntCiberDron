package ZSDataAccessComponent.ZSDAO;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaTipoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHormigaTipoDAO extends ZSDataHelperSQLiteDAO<ZSHormigaTipoDTO> {

    public ZSHormigaTipoDAO(Class<ZSHormigaTipoDTO> ZSDtoClass, String zsTableName, String zsTablePK)
            throws ZSAppException {
        super(ZSHormigaTipoDTO.class, "zsHormigaTipo", "zsIdHormigaTipo");
    }
    
}
