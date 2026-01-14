package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaTipoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHormigaTipoDAO extends ZSDataHelperSQLiteDAO<ZSHormigaTipoDTO> {

    public ZSHormigaTipoDAO()
            throws ZSAppException {
        super(ZSHormigaTipoDTO.class, "ZSHormigaTipo", "IdZSHormigaTipo");
    }
    
}
