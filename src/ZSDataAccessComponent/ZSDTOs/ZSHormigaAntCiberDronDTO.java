package ZSDataAccessComponent.ZSDTOs;

public class ZSHormigaAntCiberDronDTO {
    private Integer IdZSHormigaAntCiberDron;
    private Integer IdZSHormiga;
    private Integer IdZSCiberDron;
    private String  zsDescripcion;
    private String  zsEstado;
    private String  zsFechaCreacion;
    private String  zsFechaModifica;

    public ZSHormigaAntCiberDronDTO(){}
    public ZSHormigaAntCiberDronDTO(Integer idZSHormigaAntCiberDron, Integer idZSHormiga, Integer idZSCiberDron,
            String zsDescripcion, String zsEstado, String zsFechaCreacion, String zsFechaModifica) {
        IdZSHormigaAntCiberDron = idZSHormigaAntCiberDron;
        IdZSHormiga = idZSHormiga;
        IdZSCiberDron = idZSCiberDron;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }
    public Integer getIdZSHormigaAntCiberDron() {
        return IdZSHormigaAntCiberDron;
    }
    public void setIdZSHormigaAntCiberDron(Integer idZSHormigaAntCiberDron) {
        IdZSHormigaAntCiberDron = idZSHormigaAntCiberDron;
    }
    public Integer getIdZSHormiga() {
        return IdZSHormiga;
    }
    public void setIdZSHormiga(Integer idZSHormiga) {
        IdZSHormiga = idZSHormiga;
    }
    public Integer getIdZSCiberDron() {
        return IdZSCiberDron;
    }
    public void setIdZSCiberDron(Integer idZSCiberDron) {
        IdZSCiberDron = idZSCiberDron;
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
    public String toString(){
        return   "\n idSexo               " + IdZSHormigaAntCiberDron 
               + "\n idHormiga            " + IdZSHormiga 
               + "\n idCiberDron          " + IdZSCiberDron
               + "\n descripcion          " + zsDescripcion 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModifica        " + zsFechaModifica;
    }
}
