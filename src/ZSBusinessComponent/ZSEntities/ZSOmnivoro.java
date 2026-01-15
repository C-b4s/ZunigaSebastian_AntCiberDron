package ZSBusinessComponent.ZSEntities;

import java.util.List;

import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSOmnivoro extends ZSAlimento{
    public ZSOmnivoro(){
        super("Omnivoro",3);
    }

    public ZSOmnivoro(String zsNombre){
        super(zsNombre,3);
    }

    public ZSAlimentoDTO getOmnivoro(int zsId) throws ZSAppException{
        return zsFactory.zsGetBy(zsId);
    }

    public List<ZSAlimentoDTO> getOmnivoros() throws ZSAppException{
        return zsFactory.zsGetAll();
    }


    @Override
    public String toString(){
        return "ZSHOmnivoro {}";
    }

}
