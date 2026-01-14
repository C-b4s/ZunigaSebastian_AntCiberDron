package ZSDataAccessComponent.ZSDAO;

import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSAlimentoDAO extends ZSDataHelperSQLiteDAO<ZSAlimentoDTO> {

    public ZSAlimentoDAO(Class<ZSAlimentoDTO> ZSDtoClass, String zsTableName, String zsTablePK) throws ZSAppException {
        super(ZSAlimentoDTO.class, "ZSAlimento", "IdZSAlimento");
    }

}
