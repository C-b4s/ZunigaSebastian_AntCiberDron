package ZSDataAccessComponent.ZSDTOs;

public class ZSHormigaTipoDTO {
    
    private Integer zsIdHormigaTipo;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;

    

    public ZSHormigaTipoDTO() {
    }

    public ZSHormigaTipoDTO(Integer zsIdHormigaTipo, String zsNombre, String zsDescripcion, String zsEstado,
            String zsFechaCreacion, String zsFechaModifica) {
        this.zsIdHormigaTipo = zsIdHormigaTipo;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getZsIdHormigaTipo() {
        return zsIdHormigaTipo;
    }

    public void setZsIdHormigaTipo(Integer zsIdHormigaTipo) {
        this.zsIdHormigaTipo = zsIdHormigaTipo;
    }

    public String getZsNombre() {
        return zsNombre;
    }

    public void setZsNombre(String zsNombre) {
        this.zsNombre = zsNombre;
    }

    public String getZsDescripcion() {
        return zsDescripcion;
    }

    public void setZsDescripcion(String zsDescripcion) {
        this.zsDescripcion = zsDescripcion;
    }

    public String getZsEstado() {
        return zsEstado;
    }

    public void setZsEstado(String zsEstado) {
        this.zsEstado = zsEstado;
    }

    public String getZsFechaCreacion() {
        return zsFechaCreacion;
    }

    public void setZsFechaCreacion(String zsFechaCreacion) {
        this.zsFechaCreacion = zsFechaCreacion;
    }

    public String getZsFechaModifica() {
        return zsFechaModifica;
    }

    public void setZsFechaModifica(String zsFechaModifica) {
        this.zsFechaModifica = zsFechaModifica;
    }

    @Override
    public String toString() {
        return   "\n IdHormigaTipo        " + zsIdHormigaTipo
               + "\n nombre               " + zsNombre 
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModificacion    " + zsFechaModifica;
    }
}
