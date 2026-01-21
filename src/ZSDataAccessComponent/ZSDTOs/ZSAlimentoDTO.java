package ZSDataAccessComponent.ZSDTOs;

public class ZSAlimentoDTO {
    private Integer IdZSAlimento;
    private Integer  IdZSAlimentoTipo;
    private String  zsNombre;
    private String  zsEstado;
    private String  zsFechaCreacion;
    private String  zsFechaModifica;

    
    

    public ZSAlimentoDTO(){}


    public ZSAlimentoDTO(Integer idZSAlimento, Integer idZSAlimentoTipo, String zsNombre) {
        IdZSAlimento = idZSAlimento;
        IdZSAlimentoTipo = idZSAlimentoTipo;
        this.zsNombre = zsNombre;
    }

    public ZSAlimentoDTO(Integer idZSAlimento, Integer idZSAlimentoTipo, String zsNombre,
            String zsEstado) {
        IdZSAlimento = idZSAlimento;
        this.IdZSAlimentoTipo = idZSAlimentoTipo;
        this.zsNombre = zsNombre;
        this.zsEstado = zsEstado;
    }

    public Integer getIdZSAlimento() {
        return IdZSAlimento;
    }

    public void setIdZSAlimento(Integer idZSAlimento) {
        IdZSAlimento = idZSAlimento;
    }

    public Integer getIdZSAlimentoTipo() {
        return IdZSAlimentoTipo;
    }

    public void setIdZSAlimentoTipo(Integer idZSAlimentoTipo) {
        this.IdZSAlimentoTipo = idZSAlimentoTipo;
    }

    public String getZsNombre() {
        return zsNombre;
    }

    public void setZSNombre(String zsNombre) {
        this.zsNombre = zsNombre;
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
    public String toString(){
          return "\n IdAlimento            " + getIdZSAlimento() 
                + "\n IdAlimentoTipo        "+ getIdZSAlimentoTipo()
                + "\n Nombre               " + getZsNombre() 
                + "\n Estado               " + getZSEstado()  
                + "\n FechaCreacion        " + getZSFechaCreacion() 
                + "\n FechaModificacion    " + getZSFechaModifica();
    }
    
}
