package ZSBusinessComponent.ZSEntities;

import ZSBusinessComponent.ZSFactoryBL;
import ZSDataAccessComponent.ZSDAOs.ZSAlimentoDAO;
import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;


public abstract class ZSAlimento {

    
    protected ZSFactoryBL<ZSAlimentoDTO> zsFactory = new ZSFactoryBL<>(ZSAlimentoDAO.class);
    protected ZSAlimentoDTO zsData = new ZSAlimentoDTO();

    

    public ZSAlimento(String zsNombre, Integer zsIdAlimentoTipo) {
        this.zsData.setZSNombre(zsNombre);
        this.zsData.setIdZSAlimento(zsIdAlimentoTipo);
    }

    public ZSAlimentoDTO getZsData() {
        return zsData;
    }

    public void setZsData(ZSAlimentoDTO zsData) {
        this.zsData = zsData;
    }

}
