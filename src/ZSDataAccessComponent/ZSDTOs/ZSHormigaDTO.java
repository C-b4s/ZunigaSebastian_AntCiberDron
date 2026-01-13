package ZSDataAccessComponent.ZSDTOs;

public class ZSHormigaDTO {
    private Integer zsIdHormiga;
    private Integer zsIdHormigaTipo;
    private Integer zsIdSexo;
    private Integer zsIdEstado;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;


    public ZSHormigaDTO(){}

    public ZSHormigaDTO(Integer zsIdHormiga, Integer zsIdHormigaTipo, Integer zsIdSexo, Integer zsIdEstado,
            String zsNombre, String zsDescripcion, String zsEstado, String zsFechaCreacion, String zsFechaModifica) {
        this.zsIdHormiga = zsIdHormiga;
        this.zsIdHormigaTipo = zsIdHormigaTipo;
        this.zsIdSexo = zsIdSexo;
        this.zsIdEstado = zsIdEstado;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getZSIdHormiga() {
        return zsIdHormiga;
    }

    public void setZSIdHormiga(Integer zsIdHormiga) {
        this.zsIdHormiga = zsIdHormiga;
    }

    public Integer getZSIdHormigaTipo() {
        return zsIdHormigaTipo;
    }

    public void setZSIdHormigaTipo(Integer zsIdHormigaTipo) {
        this.zsIdHormigaTipo = zsIdHormigaTipo;
    }

    public Integer getZSIdSexo() {
        return zsIdSexo;
    }

    public void setZSIdSexo(Integer zsIdSexo) {
        this.zsIdSexo = zsIdSexo;
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
        return   "\n idHormiga            " + zsIdHormiga 
               + "\n idHormigaTipo        " + zsIdHormigaTipo
               + "\n idSexo               " + zsIdSexo
               + "\n idEstado             " + zsIdEstado    
               + "\n nombre               " + zsNombre 
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModificacion    " + zsFechaModifica;
    }
    
    

    
}
