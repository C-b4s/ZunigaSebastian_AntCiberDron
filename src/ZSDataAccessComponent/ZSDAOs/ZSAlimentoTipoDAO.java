package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSDTOs.ZSAlimentoTipoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSAlimentoTipoDAO extends ZSDataHelperSQLiteDAO<ZSAlimentoTipoDTO>{
    
    public ZSAlimentoTipoDAO()
            throws ZSAppException {
        super(ZSAlimentoTipoDTO.class, "ZSAlimentoTipo", "IdZSAlimentoTipo");
    }

}
