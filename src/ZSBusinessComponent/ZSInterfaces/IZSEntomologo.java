package ZSBusinessComponent.ZSInterfaces;

import java.util.List;

import ZSBusinessComponent.ZSEntities.ZSAlimento;
import ZSBusinessComponent.ZSEntities.ZSHormiga;
import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppException;

public interface IZSEntomologo {
    public List<ZSHormigaDTO> zsEtlAntNest() throws ZSAppException;
    public List<ZSAlimentoDTO> zsEtlAntFood() throws ZSAppException;
    public ZSHormiga zsAlimentarAnt(ZSHormiga zsHormiga,ZSAlimento zsAlimento);
}
