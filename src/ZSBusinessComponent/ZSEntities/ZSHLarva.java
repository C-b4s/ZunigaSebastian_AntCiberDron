package ZSBusinessComponent.ZSEntities;

import java.util.List;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHLarva extends ZSHormiga{
    
    public ZSHormigaDTO getLarva(int zsId) throws ZSAppException{
        return zsFactory.getBy(zsId);
    }
    
    public List<ZSHormigaDTO> getLarvas() throws ZSAppException{
        return zsFactory.getAll();
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
