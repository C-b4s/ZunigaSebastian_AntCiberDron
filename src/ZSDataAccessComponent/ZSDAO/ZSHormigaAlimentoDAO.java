package ZSDataAccessComponent.ZSDAO;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaAlimentoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHormigaAlimentoDAO extends ZSDataHelperSQLiteDAO<ZSHormigaAlimentoDTO>{

    public ZSHormigaAlimentoDAO(Class<ZSHormigaAlimentoDTO> ZSDtoClass, String zsTableName, String zsTablePK)
            throws ZSAppException {
        super(ZSHormigaAlimentoDTO.class, "ZSHormigaAlimento", "IdZSHormigaAlimento");
    }

}
