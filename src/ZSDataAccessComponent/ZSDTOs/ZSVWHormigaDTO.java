package ZSDataAccessComponent.ZSDTOs;

public class ZSVWHormigaDTO {
    private String IdZSHormiga;
    private String ZSTipo;
    private String ZSSexo;
    private String ZSEstadoHormiga;
    private String ZSNombre;
    private String ZSDescripcion;
    private String ZSEstado;
    private String ZSFechaCreacion;
    private String ZSFechaModifica;
    
    public ZSVWHormigaDTO() {}

    public ZSVWHormigaDTO(String idZSHormiga,String zSTipo, String zSSexo, String zSEstadoHormiga, String zSNombre, String zSDescripcion,
            String zSEstado, String zSFechaCreacion, String zSFechaModifica) {
        IdZSHormiga     = idZSHormiga;
        ZSTipo          = zSTipo;
        ZSSexo          = zSSexo;
        ZSEstadoHormiga = zSEstadoHormiga;
        ZSNombre        = zSNombre;
        ZSDescripcion   = zSDescripcion;
        ZSEstado        = zSEstado;
        ZSFechaCreacion = zSFechaCreacion;
        ZSFechaModifica = zSFechaModifica;
    }

    public String getIdZSHormiga() {
        return IdZSHormiga;
    }

    public void setIdZSHormiga(String idZSHormiga) {
        IdZSHormiga = idZSHormiga;
    }

    public String getZSTipo() {
        return ZSTipo;
    }

    public void setZSTipo(String zSTipo) {
        ZSTipo = zSTipo;
    }

    public String getZSSexo() {
        return ZSSexo;
    }

    public void setZSSexo(String zSSexo) {
        ZSSexo = zSSexo;
    }

    public String getZSEstadoHormiga() {
        return ZSEstadoHormiga;
    }

    public void setZSEstadoHormiga(String zSEstadoHormiga) {
        ZSEstadoHormiga = zSEstadoHormiga;
    }

    public String getZSNombre() {
        return ZSNombre;
    }

    public void setZSNombre(String zSNombre) {
        ZSNombre = zSNombre;
    }

    public String getZSDescripcion() {
        return ZSDescripcion;
    }

    public void setZSDescripcion(String zSDescripcion) {
        ZSDescripcion = zSDescripcion;
    }

    public String getZSEstado() {
        return ZSEstado;
    }

    public void setZSEstado(String zSEstado) {
        ZSEstado = zSEstado;
    }

    public String getZSFechaCreacion() {
        return ZSFechaCreacion;
    }

    public void setZSFechaCreacion(String zSFechaCreacion) {
        ZSFechaCreacion = zSFechaCreacion;
    }

    public String getZSFechaModifica() {
        return ZSFechaModifica;
    }

    public void setZSFechaModifica(String zSFechaModifica) {
        ZSFechaModifica = zSFechaModifica;
    }   

    @Override
    public String toString(){
        return getClass().getName()
         +"\nIdHormiga          : " + getIdZSHormiga()
         +"\nTipo               : " + getZSTipo()
         +"\nSexo               : " + getZSSexo()
         +"\nEstadoHormiga      : " + getZSEstadoHormiga()
         +"\nNombre             : " + getZSNombre()
         +"\nDescripcion        : " + getZSDescripcion()
         +"\nEstado             : " + getZSEstado()
         +"\nFechaCreacion      : " + getZSFechaCreacion()
         +"\nFechaModifica      : " + getZSFechaModifica()
         +"\n-------------------------------";
    }


    
}
