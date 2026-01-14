import ZSAppComponent.ZSConsoleApp.ZSSistemaRuso;
import ZSBusinessComponent.ZSEntities.ZSAutomata;
import ZSDataAccessComponent.ZSDAO.ZSAlimentoTipoDAO;
import ZSDataAccessComponent.ZSDAO.ZSEstadoDAO;
import ZSDataAccessComponent.ZSDAO.ZSHormigaDAO;
import ZSDataAccessComponent.ZSDAO.ZSHormigaTipoDAO;
import ZSDataAccessComponent.ZSDAO.ZSSexoDAO;
import ZSDataAccessComponent.ZSDTOs.ZSAlimentoTipoDTO;
import ZSDataAccessComponent.ZSDTOs.ZSEstadoDTO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaTipoDTO;
import ZSDataAccessComponent.ZSDTOs.ZSSexoDTO;
import ZSInfrastructureComponent.ZSAppException;
import ZSInfrastructureComponent.ZSTools.ZSCMDColor;
import ZSInfrastructureComponent.ZSTools.ZSCMDProgress;
import ZSInfrastructureComponent.ZSTools.ZSMSG;

public class App {
    public static void main(String[] args) throws Exception {
        //Pruebas de DAO y DTO:
        // ZSSexoDAO zsSexo = new ZSSexoDAO(ZSSexoDTO.class, "ZSSexo", "IdZSSexo");
        // for (ZSSexoDTO sexo : zsSexo.zsReadAll()) 
        //     System.out.println(sexo.toString());


        // ZSAlimentoTipoDAO zsAlimento = new ZSAlimentoTipoDAO(ZSAlimentoTipoDTO.class, "ZSAlimentoTipo", "IdZSAlimentoTipo");

        // for (ZSAlimentoTipoDTO alimento : zsAlimento.zsReadAll()) 
        //     System.out.println(alimento.toString());


        // ZSHormigaTipoDAO zsHormigaTipo = new ZSHormigaTipoDAO(ZSHormigaTipoDTO.class, "zsHormigaTipo", "zsIdHormigaTipo");

        // for (ZSHormigaTipoDTO hormigaTipo : zsHormigaTipo.zsReadAll()) 
        //     System.out.println(hormigaTipo.toString());


        // ZSEstadoDAO zsEstado = new ZSEstadoDAO(ZSEstadoDTO.class, "zsEstado", "zsIdEstaedo");
        // for (ZSEstadoDTO zsEs : zsEstado.zsReadAll())
        //     System.out.println(zsEs.toString());

        // System.out.println("\n-------------------------------------------");
        // System.out.println(ZSCMDColor.BRIGHT_YELLOW + "Listado de todas las hormigas" + ZSCMDColor.RESET);

        // ZSHormigaDAO zsHormiga = new ZSHormigaDAO(ZSHormigaDTO.class, "zsHormiga", "zsIdHormiga");

        // for (ZSHormigaDTO hormiga : zsHormiga.zsReadAll()){
        //     ZSCMDProgress.showSpinner();
        //     System.out.println();
        //     System.out.println(hormiga.toString());
        // }

            
        // ZSAutomata zsAutomata = new ZSAutomata();
        // boolean boom = zsAutomata.checkTipoArsenal("abcddddddd ");

        // System.out.println(boom? "Exploto!" : "No exploto");

        // ZSSistemaRuso sistemaRuso = new ZSSistemaRuso();
        // sistemaRuso.zsReadCoord("storage\\DataFile\\ZunigaSebastian.csv");
        
        // int a = 10;
        // int b = 0;
        // try {
        //     a=a/b;
        // } catch (Exception e) {
        //     ZSAppException appEx = new ZSAppException("Error al dividir por cero",e,null,"main(...)");
        //     ZSMSG.showMsgError(appEx.getMessage());
        // }


    }
}
