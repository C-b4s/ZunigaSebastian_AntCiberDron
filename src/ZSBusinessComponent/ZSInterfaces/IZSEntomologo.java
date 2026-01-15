package ZSBusinessComponent.ZSInterfaces;

import java.util.List;

import ZSBusinessComponent.ZSEntities.ZSAlimento;
import ZSBusinessComponent.ZSEntities.ZSHormiga;

public interface IZSEntomologo {
    public List<ZSHormiga> zsEtlAntNest();
    public List<ZSAlimento> zsEtlAntFood();
    public ZSHormiga zsAlimentarAnt(ZSHormiga zsHormiga,ZSAlimento zsAlimento);
}
