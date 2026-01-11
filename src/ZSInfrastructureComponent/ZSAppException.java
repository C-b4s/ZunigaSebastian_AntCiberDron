package ZSInfrastructureComponent;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ZSInfrastructureComponent.ZSTools.ZSCMDColor;

public class ZSAppException extends Exception{
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ZSAppException(String message){
        super(message);
        saveLogFile(null,null,message);
    }

    public ZSAppException(Exception e, Class<?> clase, String metodo){
        super(e.getMessage());
        saveLogFile(e.getMessage(),clase,metodo);
    }

    private void saveLogFile(String zsError, Class<?> clase, String metodo) {
        String zsTimeStamp  = LocalDateTime.now().format(FORMATTER);
        String zsClassName  = (clase == null) ? "undefined" : clase.getSimpleName();
        String zsMethodName = (metodo == null || metodo.isBlank()) ? "undefined" : metodo;
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
