package ZSBusinessComponent.ZSEntities;

import java.util.List;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHLarva extends ZSHormiga{
    
    public ZSHormigaDTO getLarva(int zsId) throws ZSAppException{
        return zsFactory.zsGetBy(zsId);
    }
    
    public List<ZSHormigaDTO> getLarvas() throws ZSAppException{
        return zsFactory.zsGetAll();
    }

    public ZSHormiga comer(String comida){
        if(comida.equals("carne")){
            return new ZSHSoldado();
        }
        return this;
            
    }   

    @Override
    public String toString(){
        return "ZSHLarva {}";
    }
}
