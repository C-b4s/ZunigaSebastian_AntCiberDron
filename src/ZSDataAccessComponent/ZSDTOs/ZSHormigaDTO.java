package ZSDataAccessComponent.ZSDTOs;

public class ZSHormigaDTO {
    private Integer IdZSHormiga;
    private Integer IdZSHormigaTipo;
    private Integer IdZSSexo;
    private Integer IdZSEstado;
    private String zsNombre;
    private String zsDescripcion;
    private String zsEstado;
    private String zsFechaCreacion;
    private String zsFechaModifica;


    public ZSHormigaDTO(){}

    public ZSHormigaDTO(Integer IdZSHormiga, Integer IdZSHormigaTipo, Integer IdZSSexo, Integer IdZSEstado,
            String zsNombre, String zsDescripcion, String zsEstado, String zsFechaCreacion, String zsFechaModifica) {
        this.IdZSHormiga = IdZSHormiga;
        this.IdZSHormigaTipo = IdZSHormigaTipo;
        this.IdZSSexo = IdZSSexo;
        this.IdZSEstado = IdZSEstado;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getIdZSHormiga() {
        return IdZSHormiga;
    }

    public void setIdZSHormiga(Integer IdZSHormiga) {
        this.IdZSHormiga = IdZSHormiga;
    }

    public Integer getIdZSHormigaTipo() {
        return IdZSHormigaTipo;
    }

    public void setIdZSHormigaTipo(Integer IdZSHormigaTipo) {
        this.IdZSHormigaTipo = IdZSHormigaTipo;
    }

    public Integer getZSIdSexo() {
        return IdZSSexo;
    }

    public void setZSIdSexo(Integer IdZSSexo) {
        this.IdZSSexo = IdZSSexo;
    }

    public Integer getZSIdEstado() {
        return IdZSEstado;
    }

    public void setZSIdEstado(Integer IdZSEstado) {
        this.IdZSEstado = IdZSEstado;
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
        return   "\n IdHormiga            " + getIdZSHormiga() 
               + "\n IdHormigaTipo        " + getIdZSHormigaTipo()
               + "\n IdSexo               " + getZSIdSexo()
               + "\n IdEstado             " + getZSIdEstado()   
               + "\n Nombre               " + getZSNombre() 
               + "\n Descripcion          " + getZSDescripcion()
               + "\n Estado               " + getZSEstado()  
               + "\n FechaCreacion        " + getZSFechaCreacion() 
               + "\n FechaModificacion    " + getZSFechaModifica();
    }
    
    

    
}
