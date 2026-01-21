package ZSAppComponent.ZSConsoleApp;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import ZSBusinessComponent.ZSFactoryBL;
import ZSBusinessComponent.ZSEntities.ZSCoordenadaUK;
import ZSBusinessComponent.ZSEntities.ZSEntomologo;
import ZSDataAccessComponent.ZSDAOs.ZSAlimentoDAO;
import ZSDataAccessComponent.ZSDAOs.ZSHormigaDAO;
import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppException;
import ZSInfrastructureComponent.ZSTools.ZSCMDColor;
import ZSInfrastructureComponent.ZSTools.ZSCMDProgress;

public class ZSSistemaRuso {
    ZSFactoryBL <ZSHormigaDTO> zsAntFactoryBl = new ZSFactoryBL<>(ZSHormigaDAO.class);
    ZSFactoryBL <ZSAlimentoDTO> zsFoodFactoryBL = new ZSFactoryBL<>(ZSAlimentoDAO.class);

    public void zsStart(ZSEntomologo zsEntomologo) throws InterruptedException{
        System.out.println(ZSCMDColor.BLUE + "Sistema Ruso iniciado...");
        ZSCMDProgress.showSpinner();
        System.out.println(ZSCMDColor.RESET);
        try{
            if(zsAutenticarEntomologo(zsEntomologo)){
                zsSaveAlimento(zsEntomologo);
                zsSaveHormiga(zsEntomologo);
            }else{
                System.out.println(ZSCMDColor.RED + "Acceso denegado. Saliendo del sistema..." + ZSCMDColor.RESET);
                System.exit(0);
            }
        }catch(Exception e){
            System.out.println(ZSCMDColor.RED + "Error durante la autenticación: " + e.getMessage() + ZSCMDColor.RESET);
        }
        
    }


    private void zsSaveAlimento(ZSEntomologo zsEntomologo) throws ZSAppException {
        try {
            List <ZSAlimentoDTO> zsLstAlimento = zsEntomologo.zsEtlAntFood();

            for (ZSAlimentoDTO zsADTO : zsLstAlimento){
                zsFoodFactoryBL.zsAdd(zsADTO);
                System.out.println("Alimento guardado: " + zsADTO.toString());
            }
        } catch (Exception e) {
            throw new ZSAppException(ZSCMDColor.GREEN + "Error al guardar alimento: " + e.getMessage() + ZSCMDColor.RESET);
        }
    }


    public boolean zsAutenticarEntomologo(ZSEntomologo zsentomologo){
        int zsCountTry = 0;
        while (zsCountTry++ < 3){
            System.out.println("=================== LOGIN ===================");
            System.out.print("Ingrese su usuario: ");
            String u = System.console().readLine();
            System.out.print("Ingrese su contrasena: ");
            String p = System.console().readLine();

            if (zsentomologo.zsCheckLogin(u,p)){
                return true;
            }
        }
        return false;
    }



    public List<ZSCoordenadaUK> zsReadCoord(String zsFileNamePath) throws IOException {
    List<ZSCoordenadaUK> zsLstCoord = new java.util.ArrayList<>();
    List<String> zsAllLines = Files.readAllLines(Paths.get(zsFileNamePath));
    for (String zsLine : zsAllLines) {
        System.out.println(zsLine);
        String[] zsCoord = zsLine.split(",");
        ZSCoordenadaUK zsCoordenada = new ZSCoordenadaUK( zsCoord[0], zsCoord[6], false);
        zsLstCoord.add(zsCoordenada);
        System.out.println( zsCoordenada.toString() );
    }
    return zsLstCoord;
}

    public void zsSaveHormiga(ZSEntomologo zsEntomologo) throws ZSAppException{
        try {
            List <ZSHormigaDTO> zsLstHormigas = zsEntomologo.zsEtlAntNest(); //cosecha hormigas
            
            for (ZSHormigaDTO zsHDTO : zsLstHormigas){
                zsAntFactoryBl.zsAdd(zsHDTO);
                System.out.println("Hormiga guardada: " + zsHDTO.toString());
            }       

        } catch (Exception e) {
            throw new ZSAppException(ZSCMDColor.GREEN + "Error al guardar hormiga: " + e.getMessage() + ZSCMDColor.RESET);
        }
    }


}
