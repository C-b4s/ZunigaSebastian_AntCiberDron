package ZSBusinessComponent.ZSEntities;

import java.util.List;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHLarva extends ZSHormiga{

    public ZSHLarva() {
        super("Larva",1);
    } 

    public ZSHLarva(String zsNombre) {
        super(zsNombre,1);
    }

    public ZSHormigaDTO getLarva(int zsId) throws ZSAppException{
        return zsFactory.zsGetBy(zsId);
    }
    
    public List<ZSHormigaDTO> getLarvas() throws ZSAppException{
        return zsFactory.zsGetAll();
    }

    public ZSHormiga comer(String comida){
        if(comida.equals("omnivoro")){
            return new ZSHZangano();
        }
        return this;
            
    }   

    @Override
    public String toString(){
        return "ZSHLarva {}";
    }
}
