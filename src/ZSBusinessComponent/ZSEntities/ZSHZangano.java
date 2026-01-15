package ZSBusinessComponent.ZSEntities;

import java.util.List;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHZangano extends ZSHormiga{

    public ZSHZangano() {
        super("Zangano",5);
    }
    public ZSHZangano(String zsNombre) {
        super(zsNombre,5);
    }

    public ZSHormigaDTO getZangano(int zsId) throws ZSAppException{
        return zsFactory.zsGetBy(zsId);
    }
    
    public List<ZSHormigaDTO> getZanganos() throws ZSAppException{
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
        return "ZSHZangano {}";
    }

}
