package ZSInfrastructureComponent;

import java.io.ObjectInputFilter.Config;
import java.net.URL;

public abstract class ZSAppConfig {
    public static final String ZSDATABASE = "jdbc:sqlite:src\\InfrastructureComponent\\Databases\\ant.sqlite";
    public static final String ZSDATAFILE = "storage\\DataFile\\ZunigaSebastian.csv";
    public static final String ZSLOGFILE  = "storage\\Logs\\ZSAppErrors.log";
    public static final URL ZSURL_LOGO    = Config.class.getResource("/GUI/Resource/Logo.png");

    private ZSAppConfig() {}
}
