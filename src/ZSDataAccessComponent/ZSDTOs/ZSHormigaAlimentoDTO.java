package ZSDataAccessComponent.ZSDTOs;

public class ZSHormigaAlimentoDTO {
    private Integer IdZSHormigaAlimento;
    private Integer IdZSHormiga;
    private Integer IdZSAlimento;
    private String  zsDescripcion;
    private String  zsEstado;
    private String  zsFechaCreacion;
    private String  zsFechaModifica;

    public ZSHormigaAlimentoDTO(){}
    
    public ZSHormigaAlimentoDTO(Integer idZSHormigaAlimento, Integer idZSHormiga, Integer idZSAlimento,
            String zsDescripcion, String zsEstado, String zsFechaCreacion, String zsFechaModifica) {
        IdZSHormigaAlimento = idZSHormigaAlimento;
        IdZSHormiga = idZSHormiga;
        IdZSAlimento = idZSAlimento;
        this.zsDescripcion = zsDescripcion;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getIdZSHormigaAlimento() {
        return IdZSHormigaAlimento;
    }

    public void setIdZSHormigaAlimento(Integer idZSHormigaAlimento) {
        IdZSHormigaAlimento = idZSHormigaAlimento;
    }

    public Integer getIdZSHormiga() {
        return IdZSHormiga;
    }

    public void setIdZSHormiga(Integer idZSHormiga) {
        IdZSHormiga = idZSHormiga;
    }

    public Integer getIdZSAlimento() {
        return IdZSAlimento;
    }

    public void setIdZSAlimento(Integer idZSAlimento) {
        IdZSAlimento = idZSAlimento;
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
