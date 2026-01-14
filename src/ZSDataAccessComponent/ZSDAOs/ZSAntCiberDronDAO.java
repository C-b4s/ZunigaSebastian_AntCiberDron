package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSDTOs.ZSAntCiberDronDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSAntCiberDronDAO extends ZSDataHelperSQLiteDAO<ZSAntCiberDronDTO>{

    public ZSAntCiberDronDAO()
            throws ZSAppException {
        super(ZSAntCiberDronDTO.class, "ZSAntCiberDron", "IdZSAntCiberDron");
    }


}
