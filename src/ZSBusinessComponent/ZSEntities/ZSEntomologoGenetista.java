package ZSBusinessComponent.ZSEntities;

import ZSDataAccessComponent.ZSDTOs.ZSEntomologoDTO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSEntomologoGenetista extends ZSEntomologo {

    public ZSEntomologoGenetista (String zsUsuario, String zsContrasena) throws ZSAppException {
        ZSEntomologoDTO zsEDTO = new ZSEntomologoDTO(zsUsuario, zsContrasena);
    }

    @Override
    public ZSHormiga zsAlimentarAnt(ZSHormiga zsHormiga, ZSAlimento zsAlimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zsAlimentarAnt'");
    }

}
