package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSDTOs.ZSEntomologoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSEntomologoDAO extends ZSDataHelperSQLiteDAO <ZSEntomologoDTO> {

    public ZSEntomologoDAO(Class<ZSEntomologoDTO> ZSDtoClass, String zsTableName, String zsTablePK)
            throws ZSAppException {
        super(ZSEntomologoDTO.class, "ZSEntomologo", "IdZSEntomologo");
    }

}
