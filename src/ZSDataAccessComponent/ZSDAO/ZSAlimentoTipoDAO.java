package ZSDataAccessComponent.ZSDAO;

import ZSDataAccessComponent.ZSDTOs.ZSAlimentoTipoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSAlimentoTipoDAO extends ZSDataHelperSQLiteDAO<ZSAlimentoTipoDTO>{

    public ZSAlimentoTipoDAO(Class<ZSAlimentoTipoDTO> ZSDtoClass, String zsTableName, String zsTablePK)
            throws ZSAppException {
        super(ZSAlimentoTipoDTO.class, "zsAlimentoTipo", "zsIdAlimentoTipo");
    }

}
