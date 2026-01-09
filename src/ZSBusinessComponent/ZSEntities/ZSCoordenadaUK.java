package ZSBusinessComponent.ZSEntities;

public class ZSCoordenadaUK {
    private String zsGeoposicion;
    private String zsTipoArsenal;
    private Boolean zsAccion;
    
    public ZSCoordenadaUK() {}
    
    public ZSCoordenadaUK(String zsGeoposicion, String zsTipoArsenal, Boolean zsAccion) {
        this.zsGeoposicion = zsGeoposicion;
        this.zsTipoArsenal = zsTipoArsenal;
        this.zsAccion = zsAccion;
    }

    public String getZSGeoposicion() {
        return zsGeoposicion;
    }

    public void setZSGeoposicion(String zsGeoposicion) {
        this.zsGeoposicion = zsGeoposicion;
    }

    public String getZSTipoArsenal() {
        return zsTipoArsenal;
    }

    public void setZSTipoArsenal(String zsTipoArsenal) {
        this.zsTipoArsenal = zsTipoArsenal;
    }

    public Boolean getZSAccion() {
        return zsAccion;
    }

    public void setZSAccion(Boolean zsAccion) {
        this.zsAccion = zsAccion;
    }

    @Override
    public String toString(){
        return getClass().getName()
         + "\n Geoposicion    : " + getZSGeoposicion()
         + "\n TipoArsenal    : " + getZSTipoArsenal()
         + "\n Accion         : " + getZSAccion();
    }

    

    
}
