package ZSBusinessComponent.ZSEntities;

import ZSBusinessComponent.ZSFactoryBL;
import ZSDataAccessComponent.ZSDAOs.ZSHormigaDAO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;

public abstract class ZSHormiga {
    
    protected ZSFactoryBL<ZSHormigaDTO> zsFactory = new ZSFactoryBL<>(ZSHormigaDAO.class);
    protected ZSHormigaDTO zsData = new ZSHormigaDTO();

    public ZSHormiga(String zsNombre, Integer zsIdHormigaTipo) {
        this.zsData.setZSNombre(zsNombre);
        this.zsData.setIdZSHormigaTipo(zsIdHormigaTipo);
    }

    public ZSHormigaDTO getZsData() {
        return zsData;
    }

    public void setZsData(ZSHormigaDTO zsData) {
        this.zsData = zsData;
    }
}
