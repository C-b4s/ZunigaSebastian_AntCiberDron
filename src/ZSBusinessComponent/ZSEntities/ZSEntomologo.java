package ZSBusinessComponent.ZSEntities;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;   
import ZSBusinessComponent.ZSInterfaces.IZSEntomologo;
import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppConfig;
import ZSInfrastructureComponent.ZSAppException;
import ZSInfrastructureComponent.ZSTools.ZSCMDColor;
import ZSInfrastructureComponent.ZSTools.ZSCMDProgress;


public abstract class ZSEntomologo implements IZSEntomologo{
    // Refactorización: se eliminaron los siguientes atributos: private String zsEstado;
    // private ZSGenoAlimento zsGenoma;
    private String zsUsuario;
    private String zsContrasena;
    private String zsNombre;
    

    

    public ZSEntomologo(){}

    public ZSEntomologo(String zsUsuario, String zsContrasena) {
        this.zsUsuario = zsUsuario;
        this.zsContrasena = zsContrasena;
    }

    public ZSEntomologo(String zsUsuario, String zsContrasena, String zsNombre) {
        this.zsUsuario    = zsUsuario   ;
        this.zsContrasena = zsContrasena;
        this.zsNombre     = zsNombre    ;
    }

    public String getZsUsuario() {
        return zsUsuario;
    }

    public void setZsUsuario(String zsUsuario) {
        this.zsUsuario = zsUsuario;
    }

    public String getZsContrasena() {
        return zsContrasena;
    }

    public void setZsContrasena(String zsContrasena) {
        this.zsContrasena = zsContrasena;
    }

    public String getZsNombre() {
        return zsNombre;
    }

    public void setZsNombre(String zsNombre) {
        this.zsNombre = zsNombre;
    }

    //Refactorización: se creó el método zsCheckLogin
    public boolean zsCheckLogin(String zsUsuario, String zsContrasena) {
            boolean auth1 = zsUsuario.equals("patmic") 
                         && zsContrasena.equals("123");

            boolean auth2 = zsUsuario.equals("ZunigaSebastian") 
                         && zsContrasena.equals("1706");

            if (auth1 || auth2) {
                System.out.println(ZSCMDColor.GREEN +"Acceso concedido.\n" + ZSCMDColor.RESET);
                return true;
            }

            System.out.println(ZSCMDColor.RED + "ERROR DE AUTENTICACIÓN");
            System.out.println("Usuario o contraseña incorrectos.");
            System.out.println("Por favor, intente nuevamente.\n" + ZSCMDColor.RESET);
            return false;
            
    }

    private int zsGetIdHormigaTipoByName(String zsName){
        switch (zsName){
            case "HLarva":       return 1;
            case "HSoldado":     return 2;
            case "HRastreadora": return 3;
            case "HReina":       return 4;
            case "HZángano":     return 5;
            default:             return 0;
        }
    }

    @Override
public List<ZSHormigaDTO> zsEtlAntNest() throws ZSAppException {
    try{
        List<ZSHormigaDTO> zsLst = new ArrayList<>();
        List <String> zsAllLines = Files.readAllLines(Paths.get(ZSAppConfig.ZSANTNEST));
        Integer zsDataIdHormiga     = 0;
        Integer zsDataIdHormigaTipo = null;
        Integer zsDataIdSexo        = 4;
        Integer zsDataIdEstado      = 1;
        String  zsDataNombre        = null;
        String  zsDataDescripcion   = null;

        for (String zsLine : zsAllLines){
            System.out.println(zsLine);
            for (String zsData : zsLine.split(",")){
                String zsDataTrim = zsData.trim();
                zsDataIdHormigaTipo = zsGetIdHormigaTipoByName(zsDataTrim);
                if (zsDataIdHormigaTipo == 1 || zsDataIdHormigaTipo == 5){
                    zsDataNombre        = zsDataTrim;
                    zsDataDescripcion   = "Hormiga de tipo " + zsDataTrim;

                    ZSCMDProgress.showSpinner();
                    System.out.println(   ZSCMDColor.BLUE 
                                        + zsDataNombre
                                        + ZSCMDColor.RESET);

                    ZSHormigaDTO zsH = new ZSHormigaDTO(  zsDataIdHormiga       ,
                    zsDataIdHormigaTipo   ,
                    zsDataIdSexo          ,
                    zsDataIdEstado        ,
                    zsDataNombre          ,
                    zsDataDescripcion);

                    zsLst.add(zsH);
                }else{
                    ZSCMDProgress.showSpinner();
                    System.out.println(   ZSCMDColor.RED
                                        + zsDataTrim
                                        + ZSCMDColor.RESET );
                }

            }
        }
            return zsLst;
        }catch(Exception e){
            throw new ZSAppException("Error leyenedo el archivo de datos de hormigas: ", e, getClass(), "zsEtlAntNEst()");
        }

}
public Integer getIdAlimentoTipoByName(String zsDataTrim){
    switch (zsDataTrim) {
        case "Carnívoro"    :       return 1;
        case "Herbívoro"    :       return 2;
        case "Omnívoro"     :       return 3;
        case "Nectarívoros" :       return 4;
        default             :       return 0;
    }
}


public List <ZSAlimentoDTO> zsEtlAntFood() throws ZSAppException{
    
    try {
       List <ZSAlimentoDTO> zsLst = new ArrayList<>();
        List <String> zsAllLines = Files.readAllLines(Paths.get(ZSAppConfig.ZSANTFOOD)); 

        Integer zsDataIdAlimento = 0;
        Integer zsDataIdAlimentoTipo = null;
        String zsDataNombre = null;
        
        for (String zsLine : zsAllLines){
            System.out.println(zsLine);
            for (String zsData : zsLine.split("-")){
                String zsDataTrim = zsData.trim();
                zsDataIdAlimentoTipo = getIdAlimentoTipoByName(zsDataTrim);
                if (zsDataIdAlimentoTipo == 3 || zsDataIdAlimentoTipo == 4){
                    zsDataNombre = zsDataTrim;
                    
                    ZSCMDProgress.showSpinner();
                    System.out.println(ZSCMDColor.BLUE + zsDataNombre + ZSCMDColor.RESET);

                    ZSAlimentoDTO zsAlimento = new ZSAlimentoDTO(
                        zsDataIdAlimento,
                        zsDataIdAlimentoTipo,
                        zsDataNombre
                    );

                    zsLst.add(zsAlimento);
                    
                }else{
                    ZSCMDProgress.showSpinner();
                    System.out.println(ZSCMDColor.RED + zsDataTrim + ZSCMDColor.RESET);
                }

                
            }
        }
        return zsLst;
    } catch (Exception e) {
        throw new ZSAppException("Error al leer el archivo de datos de alimentos", e, getClass(), "zsEtlAntFood()");
    }
    
    


}



public ZSHormiga zsAlimentarAnt(
        ZSEntomologo entomologo,
        ZSHormiga hormiga,
        ZSAlimento alimento
) throws ZSAppException {

    if (entomologo == null)
        throw new ZSAppException("No existe entomólogo");

    if (hormiga == null)
        throw new ZSAppException("No existe la hormiga");

    if (alimento == null)
        throw new ZSAppException("No existe el alimento");
    
    if ("OMNIVORO".equalsIgnoreCase(alimento.getZsData().getZsNombre())) {
        hormiga.getZsData().setIdZSHormigaTipo(5);
        hormiga.getZsData().setZSIdEstado(1);
    }else{
        hormiga.getZsData().setZSIdEstado(2);
    } 

    return hormiga;
}
    
};

    

