package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaAlimentoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHormigaAlimentoDAO extends ZSDataHelperSQLiteDAO<ZSHormigaAlimentoDTO>{

    public ZSHormigaAlimentoDAO()
            throws ZSAppException {
        super(ZSHormigaAlimentoDTO.class, "ZSHormigaAlimento", "IdZSHormigaAlimento");
    }

}
