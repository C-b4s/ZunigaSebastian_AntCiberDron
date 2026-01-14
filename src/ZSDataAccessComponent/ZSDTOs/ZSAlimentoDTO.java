package ZSDataAccessComponent.ZSDTOs;

public class ZSAlimentoDTO {
    private Integer IdZSAlimento;
    private String  zsAlimentoTipo;
    private String  zsNombre;
    private String  zsDescripcion;
    private String  zsEstado;
    private String  zsFechaCreacion;
    private String  zsFechaModifica;

    
    public ZSAlimentoDTO(){}

    public ZSAlimentoDTO(Integer idZSAlimento, String zsAlimentoTipo, String zsNombre, String zsDescripcion,
            String zsEstado) {
        IdZSAlimento = idZSAlimento;
        this.zsAlimentoTipo = zsAlimentoTipo;
        this.zsNombre = zsNombre;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
    }

    public Integer getIdZSAlimento() {
        return IdZSAlimento;
    }

    public void setIdZSAlimento(Integer idZSAlimento) {
        IdZSAlimento = idZSAlimento;
    }

    public String getZSAlimentoTipo() {
        return zsAlimentoTipo;
    }

    public void setZSAlimentoTipo(String zsAlimentoTipo) {
        this.zsAlimentoTipo = zsAlimentoTipo;
    }

    public String getZsNombre() {
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
    
}
