package ZSDataAccessComponent.ZSDTOs;

public class ZSEstadoDTO {
    
    private Integer zsIdEstado;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;
    
    public ZSEstadoDTO() {
    }

    public ZSEstadoDTO(Integer zsIdEstado, String zsNombre, String zsDescripcion, String zsEstado,
            String zsFechaCreacion, String zsFechaModifica) {
        this.zsIdEstado = zsIdEstado;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }
    


    public Integer getZSIdEstado() {
        return zsIdEstado;
    }


    public void setZSIdEstado(Integer zsIdEstado) {
        this.zsIdEstado = zsIdEstado;
    }


    public String getZSNombre() {
        return zsNombre;
    }


    public void setZSNombre(String zsNombre) {
        this.zsNombre = zsNombre;
    }


    public String getZsDescripcion() {
        return zsDescripcion;
    }


    public void setZSDescripcion(String zsDescripcion) {
        this.zsDescripcion = zsDescripcion;
    }


    public String getZSEstado() {
        return zsEstado;
    }


    public void setZsEstado(String zsEstado) {
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
    public String toString(){
        return   "\n idEstado             " + zsIdEstado
               + "\n nombre               " + zsNombre 
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModificacion    " + zsFechaModifica;
    }
}
