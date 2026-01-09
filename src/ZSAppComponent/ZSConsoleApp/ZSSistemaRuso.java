package ZSAppComponent.ZSConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import ZSBusinessComponent.ZSEntities.ZSCoordenadaUK;

public class ZSSistemaRuso {
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
}
