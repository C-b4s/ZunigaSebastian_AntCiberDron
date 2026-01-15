package ZSInfrastructureComponent;
import java.net.URL;

public abstract class ZSAppConfig {
    
    //Paths Storage
    public static final String ZSDATABASE = "jdbc:sqlite:storage\\Databases\\ZSAnt.sqlite";
    public static final String ZSDATAFILE = "storage\\DataFile\\ZunigaSebastian.csv";
    public static final String ZSANTNEST = "storage\\DataFile\\ZSAntNest.txt";
    public static final String ZSANTFOOD = "storage\\DataFile\\ZSAntFood.txt";
    public static final String ZSLOGFILE  = "storage\\Logs\\ZSAppErrors.log";


    //Resources
    public static final URL ZSURL_MAIN    = ZSAppConfig.class.getResource("/GUI/ZSResource/ZSMain.png");
    public static final URL ZSURL_LOGO    = ZSAppConfig.class.getResource("/GUI/ZSResource/ZSLogo.png");
    public static final URL ZSURL_SPLASH  = ZSAppConfig.class.getResource("/ZSInfrastructureComponent/ZSAssets/ZSImg/ZSSplash.png"); 
    
    //ZSMSGs
    public static final String ZSMSG_DEFAULT_ERROR  = "Ups! Error inesperado. Por favor, contacte al administrador del sistema.";
    public static final String ZSMSG_DEFAULT_CLASS = "undefined";
    public static final String ZS_DEFAULT_METHOD   = "undefined";

    private ZSAppConfig() {}
}
