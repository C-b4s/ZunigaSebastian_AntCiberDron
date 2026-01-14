package ZSDataAccessComponent.ZSDTOs;

public class ZSAntCiberDronDTO {
    private Integer IdZSAntCiberDron;
    private String  zsSerie;
    private String  zsEstado;
    private String  zsFechaCreacion;
    private String  zsFechaModifica;

public ZSAntCiberDronDTO(){}

    public ZSAntCiberDronDTO(Integer idZSAntCiberDron, String zsSerie, String zsEstado, String zsFechaCreacion,
            String zsFechaModifica) {
        IdZSAntCiberDron = idZSAntCiberDron;
        this.zsSerie = zsSerie;
        this.zsEstado = zsEstado;
        this.zsFechaCreacion = zsFechaCreacion;
        this.zsFechaModifica = zsFechaModifica;
    }

    public Integer getIdZSAntCiberDron() {
        return IdZSAntCiberDron;
    }

    public void setIdZSAntCiberDron(Integer idZSAntCiberDron) {
        IdZSAntCiberDron = idZSAntCiberDron;
    }

    public String getZSSerie() {
        return zsSerie;
    }

    public void setZSSerie(String zsSerie) {
        this.zsSerie = zsSerie;
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
        return   "\n idAntCiberDron       " + IdZSAntCiberDron
               + "\n serie                " + zsSerie 
               + "\n estado               " + zsEstado  
               + "\n fechaCreacion        " + zsFechaCreacion 
               + "\n fechaModifica        " + zsFechaModifica;
    }
}
