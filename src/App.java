import ZSAppComponent.ZSConsoleApp.ZSSistemaRuso;
import ZSBusinessComponent.ZSEntities.ZSEnt;
public class App {
    public static void main(String[] args) throws Exception {
        
    ZSSistemaRuso sistemaRuso = new ZSSistemaRuso();
    ZSEnt zsEntomologoComun = new ZSEnt("ZunigaSebastian","1706");

    sistemaRuso.zsStart(zsEntomologoComun);

}



}


        

        //         System.out.println(dto.toString());
        //   }
        
        //Pruebas de BL:
        // try {
        //     ZSHLarva zsL = new ZSHLarva();
        //     System.out.println(zsL.getLarva(1).toString());
        // } catch (Exception e) {

        //     e.printStackTrace();
        // } 
        
        
        
        
        
        //Pruebas de DAO y DTO:
        // try {
        //   ZSAntCiberDronDAO zsDao = new ZSAntCiberDronDAO();

        //   for (int i = 1; i <= 5; i++){
        //     ZSAntCiberDronDTO zsODTO = zsDao.zsReadBy(i);
        //     zsODTO.setZSSerie("Serie-00" + i);
        //     zsDao.zsUpdate(zsODTO);

        //     for(var dto: zsDao.zsReadAll())
        //         System.out.println(dto.toString());
        //   }
        // } catch (Exception e) {}
        
        
        
        
        // ZSSexoDAO zsSexo = new ZSSexoDAO(ZSSexoDTO.class, "ZSSexo", "IdZSSexo");
        // for (ZSSexoDTO sexo : zsSexo.zsReadAll()) 
        //     System.out.println(sexo.toString());


        // ZSAlimentoTipoDAO zsAlimento = new ZSAlimentoTipoDAO();
        


        // ZSAlimentoTipoDTO oDTO = zsAlimento.zsReadBy(1);
        // oDTO.setZSNombre("CARNIVORO");
        // oDTO.setZSDescripcion("Salado");
        // zsAlimento.zsUpdate(oDTO);

        // for (ZSAlimentoTipoDTO alimento : zsAlimento.zsReadAll()) 
        //    System.out.println(alimento.toString());




        // try {
        //     ZSHormigaDAO dao = new ZSHormigaDAO();
        //     for (ZSVWHormigaDTO string : dao.zsReadAllvwHormiga())
        //         System.out.println(string.toString());
        // } catch (Exception e) {
        // }
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

        

        //Pruebas con clases de ZSEntities:
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

 

