package ZSBusinessComponent.ZSEntities;

import java.util.List;

import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSNectarivoro extends ZSAlimento{
    public ZSNectarivoro(){
        super("Nectarivoro",4);
    }

    public ZSNectarivoro(String zsNombre){
        super(zsNombre,4);
    }

    public ZSAlimentoDTO getLarva(int zsId) throws ZSAppException{
        return zsFactory.zsGetBy(zsId);
    }

    public List<ZSAlimentoDTO> getLarvas() throws ZSAppException{
        return zsFactory.zsGetAll();
    }


    @Override
    public String toString(){
        return "ZSNectarivoro {}";
    }
}
