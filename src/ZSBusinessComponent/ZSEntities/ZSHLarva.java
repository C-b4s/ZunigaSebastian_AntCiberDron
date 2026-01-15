package ZSBusinessComponent.ZSEntities;

import java.util.List;

import ZSBusinessComponent.ZSFactoryBL;
import ZSDataAccessComponent.ZSDAOs.ZSHormigaDAO;
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

    //Refactorización: Se cambió el tipo de retorno de Boolean a ZSHormiga para permitir la creación de un nuevo ZSHZangano.
    public Boolean comer(String comida) throws ZSAppException{
        if(comida.equals("omnivoro")){
            System.out.println("La larva ha comido y se ha transformado en Zangano.");
            return true;
        }else{
            System.out.println("La larva no puede comer ese tipo de alimento.");
            return false;
        }            
    }   

    @Override
    public String toString(){
        return "ZSHLarva {}";
    }
}
