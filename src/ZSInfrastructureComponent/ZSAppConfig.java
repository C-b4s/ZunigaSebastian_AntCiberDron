package ZSInfrastructureComponent;

import java.io.ObjectInputFilter.Config;
import java.net.URL;

public abstract class ZSAppConfig {
    public static final String ZSDATABASE = "jdbc:sqlite:src\\InfrastructureComponent\\Databases\\ant.sqlite";
    public static final String ZSDATAFILE = "Data\\hormiguero.csv";
    public static final String ZSLOGFILE  = "storage\\Logs\\AppErrors.log";
    public static final URL ZSURL_LOGO    = Config.class.getResource("/GUI/Resource/Logo.png");

    private ZSAppConfig() {}
}
