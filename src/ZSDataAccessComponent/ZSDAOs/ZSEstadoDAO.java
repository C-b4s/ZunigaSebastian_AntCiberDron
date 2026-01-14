package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSDTOs.ZSEstadoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSEstadoDAO extends ZSDataHelperSQLiteDAO<ZSEstadoDTO>{

    public ZSEstadoDAO() throws ZSAppException {
        super(ZSEstadoDTO.class, "ZSEstado", "IdZSEstado");
    }

}
