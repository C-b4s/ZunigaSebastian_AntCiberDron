package ZSDataAccessComponent.ZSDTOs;

public class ZSAlimentoTipoDTO {
    private Integer IdZSAlimentoTipo;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;
    
    public ZSAlimentoTipoDTO() {
    }

    public ZSAlimentoTipoDTO(Integer IdZSAlimentoTipo, String zsNombre, String zsDescripcion, String zsEstado,
            String zsFechaCreacion, String zsFechaModifica) {
        this.IdZSAlimentoTipo = IdZSAlimentoTipo;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getIdZSAlimentoTipo() {
        return IdZSAlimentoTipo;
    }

    public void setIdZSAlimentoTipo(Integer IdZSAlimentoTipo) {
        this.IdZSAlimentoTipo = IdZSAlimentoTipo;
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
        return   "\n idAlimentoTipo       " + IdZSAlimentoTipo
               + "\n nombre               " + zsNombre 
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModificacion    " + zsFechaModifica;
    }

    

    
    
}
