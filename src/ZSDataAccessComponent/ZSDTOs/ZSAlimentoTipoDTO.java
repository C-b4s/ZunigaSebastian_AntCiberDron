package ZSDataAccessComponent.ZSDTOs;

public class ZSAlimentoTipoDTO {
    private Integer zsIdAlimentoTipo;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;
    
    public ZSAlimentoTipoDTO() {
    }

    public ZSAlimentoTipoDTO(Integer zsIdAlimentoTipo, String zsNombre, String zsDescripcion, String zsEstado,
            String zsFechaCreacion, String zsFechaModifica) {
        this.zsIdAlimentoTipo = zsIdAlimentoTipo;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getZSIdAlimentoTipo() {
        return zsIdAlimentoTipo;
    }

    public void setZSIdAlimentoTipo(Integer zsIdAlimentoTipo) {
        this.zsIdAlimentoTipo = zsIdAlimentoTipo;
    }

    public String getZSNombre() {
        return zsNombre;
    }

    public void setZSNombre(String zsNombre) {
        this.zsNombre = zsNombre;
    }

    public String getZSDescripcion() {
        return zsDescripcion;
    }

    public void setZSDescripcion(String zsDescripcion) {
        this.zsDescripcion = zsDescripcion;
    }

    public String getZSEstado() {
        return zsEstado;
    }

    public void setZSEstado(String zsEstado) {
        this.zsEstado = zsEstado;
    }

    public String getZSFechaCreacion() {
        return zsFechaCreacion;
    }

    public void setZSFechaCreacion(String zsFechaCreacion) {
        this.zsFechaCreacion = zsFechaCreacion;
    }

    public String getZSFechaModifica() {
        return zsFechaModifica;
    }

    public void setZSFechaModifica(String zsFechaModifica) {
        this.zsFechaModifica = zsFechaModifica;
    }

    @Override
    public String toString() {
        return   "\n idAlimentoTipo       " + zsIdAlimentoTipo
               + "\n nombre               " + zsNombre 
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModificacion    " + zsFechaModifica;
    }

    

    
    
}
