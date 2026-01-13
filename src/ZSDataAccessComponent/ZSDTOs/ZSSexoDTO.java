package ZSDataAccessComponent.ZSDTOs;

public class ZSSexoDTO {
    private Integer zsIdSexo;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;
    
    
    public ZSSexoDTO() {
    }

    public ZSSexoDTO(Integer zsIdSexo, String zsNombre, String zsDescripcion, String zsEstado, String zsFechaCreacion,
            String zsFechaModifica) {
        this.zsIdSexo = zsIdSexo;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getZSIdSexo() {
        return zsIdSexo;
    }

    public void setZSIdSexo(Integer zsIdSexo) {
        this.zsIdSexo = zsIdSexo;
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
    public String toString() {
        return   "\n idSexo               " + zsIdSexo
               + "\n nombre               " + zsNombre 
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModifica        " + zsFechaModifica;
    }

}
