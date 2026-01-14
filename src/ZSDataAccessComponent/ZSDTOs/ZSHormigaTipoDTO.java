package ZSDataAccessComponent.ZSDTOs;

public class ZSHormigaTipoDTO {
    
    private Integer IdZSHormigaTipo;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;

    

    public ZSHormigaTipoDTO() {
    }

    public ZSHormigaTipoDTO(Integer IdZSHormigaTipo, String zsNombre, String zsDescripcion, String zsEstado,
            String zsFechaCreacion, String zsFechaModifica) {
        this.IdZSHormigaTipo = IdZSHormigaTipo;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getIdZSHormigaTipo() {
        return IdZSHormigaTipo;
    }

    public void setIdZSHormigaTipo(Integer IdZSHormigaTipo) {
        this.IdZSHormigaTipo = IdZSHormigaTipo;
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
        return   "\n IdHormigaTipo        " + IdZSHormigaTipo
               + "\n nombre               " + zsNombre 
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModificacion    " + zsFechaModifica;
    }
}
