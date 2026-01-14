package ZSDataAccessComponent.ZSDAO;

import ZSDataAccessComponent.ZSDTOs.ZSEstadoDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSEstadoDAO extends ZSDataHelperSQLiteDAO<ZSEstadoDTO>{

    public ZSEstadoDAO(Class<ZSEstadoDTO> ZSDtoClass, String zsTableName, String zsTablePK) throws ZSAppException {
        super(ZSEstadoDTO.class, "ZSEstado", "IdZSEstado");
    }

}
