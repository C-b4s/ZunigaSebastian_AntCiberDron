package ZSInfrastructureComponent;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import ZSInfrastructureComponent.ZSTools.ZSCMDColor;

public class ZSAppException extends Exception{
    private static final DateTimeFormatter ZSFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
 
    public ZSAppException(String zsMessage) {
        super(zsMessage);
        saveLogFile(null, null, zsMessage);
    }
    public ZSAppException(Exception e, Class<?> zsClase, String zsMetodo) {
        super(e.getMessage());
        saveLogFile(e.getMessage(), zsClase, zsMetodo);
    }

    private void saveLogFile(String zsError, Class<?> zsClase, String zsMetodo) {
        String zsTimeStamp  = LocalDateTime.now().format(ZSFORMATTER);
        String zsClassName  = (zsClase == null) ? "undefined" : zsClase.getSimpleName();
        String zsMethodName = (zsMetodo == null || zsMetodo.isBlank()) ? "undefined" : zsMetodo;
        String zsLogMessage = String.format("[ AppException | %s.%s | %s ]  ❱ %s", zsClassName, zsMethodName, zsTimeStamp, zsError);

        try (PrintWriter writer = new PrintWriter(new FileWriter(ZSAppConfig.ZSLOGFILE, true))) {
            System.err.println(ZSCMDColor.BLUE  + zsLogMessage);
            writer.println(zsLogMessage);
        } catch (Exception e) {
            System.err.println(ZSCMDColor.RED  + "[AppException.saveLogFile] ❱ " + e.getMessage());
        }finally {
            System.out.println(ZSCMDColor.RESET);
        }
    }


}
