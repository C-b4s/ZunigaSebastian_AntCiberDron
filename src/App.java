import ZSAppComponent.ZSConsoleApp.ZSSistemaRuso;
import ZSBusinessComponent.ZSEntities.ZSAutomata;

public class App {
    public static void main(String[] args) throws Exception {
        ZSAutomata zsAutomata = new ZSAutomata();
        boolean boom = zsAutomata.checkTipoArsenal("abcddddddd ");

        System.out.println(boom? "Exploto!" : "No exploto");

        ZSSistemaRuso sistemaRuso = new ZSSistemaRuso();
        sistemaRuso.zsReadCoord("DataFile\\ZunigaSebastian.csv");
        
    }
}
