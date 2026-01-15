package ZSBusinessComponent.ZSEntities;

public class ZSEnt extends ZSEntomologo {
    public ZSEnt() {
        super();
    }

    public ZSEnt(String zsUsuario, String zsContrasena, String zsNombre) {
        super(zsUsuario, zsContrasena, zsNombre);
    }

    @Override
    public ZSHormiga zsAlimentarAnt(ZSHormiga zsHormiga, ZSAlimento zsAlimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zsAlimentarAnt'");
    }

}
