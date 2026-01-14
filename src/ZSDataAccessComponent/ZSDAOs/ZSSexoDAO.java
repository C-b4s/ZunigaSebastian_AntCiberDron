package ZSDataAccessComponent.ZSDAOs;

import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSDataAccessComponent.ZSDTOs.ZSSexoDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSSexoDAO extends ZSDataHelperSQLiteDAO<ZSSexoDTO>{
    public ZSSexoDAO() throws ZSAppException {
        super(ZSSexoDTO.class, "ZSSexo", "IdZSSexo");
    }

}
