package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSAlimentoDAO extends ZSDataHelperSQLiteDAO<ZSAlimentoDTO> {

    public ZSAlimentoDAO() throws ZSAppException {
        super(ZSAlimentoDTO.class, "ZSAlimento", "IdZSAlimento");
    }

}
