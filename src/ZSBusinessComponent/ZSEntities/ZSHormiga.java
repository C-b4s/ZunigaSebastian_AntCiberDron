package ZSBusinessComponent.ZSEntities;

import ZSBusinessComponent.ZSFactoryBL;
import ZSDataAccessComponent.ZSDAOs.ZSHormigaDAO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;

public abstract class ZSHormiga {
    
    protected ZSFactoryBL<ZSHormigaDTO> zsFactory = new ZSFactoryBL<>(ZSHormigaDAO.class);
    public ZSHormigaDTO zsData = new ZSHormigaDTO();
    ZSAntCiberDron usaAntCiberDron = new ZSAntCiberDron();



    public ZSHormigaDTO getZsData() {
        return zsData;
    }

    public void setZsData(ZSHormigaDTO zsData) {
        this.zsData = zsData;
    }
}
