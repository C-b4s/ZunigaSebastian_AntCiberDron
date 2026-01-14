package ZSDataAccessComponent.ZSDAO;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHormigaDAO extends ZSDataHelperSQLiteDAO <ZSHormigaDTO>{

    public ZSHormigaDAO(Class<ZSHormigaDTO> ZSDtoClass, String zsTableName, String zsTablePK) throws ZSAppException {
        super(ZSHormigaDTO.class, "ZSHormiga", "IdZSHormiga");
    }

}
