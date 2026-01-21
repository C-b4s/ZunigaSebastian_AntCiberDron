package ZSBusinessComponent.ZSEntities;

import java.util.List;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHZangano extends ZSHormiga{

    public ZSHormigaDTO getZangano(int zsId) throws ZSAppException{
        return zsFactory.zsGetBy(zsId);
    }
    
    public List<ZSHormigaDTO> getZanganos() throws ZSAppException{
        return zsFactory.zsGetAll();
    }

    public Boolean comer(String comida) throws ZSAppException{
        if(comida.equals("omnivoro")){
            System.out.println("La hormiga sigue siendo un zangano");
            return true;
        }else{
            System.out.println("La hormiga no puede comer ese tipo de alimento.");
            return false;
        }            
    }   

    @Override
    public String toString(){
        return "ZSHZangano {}";
    }

}
