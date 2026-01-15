package ZSAppComponent.ZSConsoleApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import ZSBusinessComponent.ZSEntities.ZSCoordenadaUK;
import ZSInfrastructureComponent.ZSTools.ZSCMDColor;

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

    public void zsCosecharArchivo(
            String zsRutaArchivo,
            Set<String> zsTiposValidos,
            List<String> zsSalidaValidos,
            Set<String> zsSalidaBasura) {

        try (BufferedReader br = new BufferedReader(
                new FileReader(zsRutaArchivo))) {

            String zsLinea;

            while ((zsLinea = br.readLine()) != null) {

                String[] zsTokens = zsLinea.split(",");

                for (String zsToken : zsTokens) {

                    String zsDato = zsToken.trim();
                    if (zsDato.isEmpty()) continue;

                    if (zsTiposValidos.contains(zsDato)) {
                        zsSalidaValidos.add(zsDato);
                    } else {
                        zsSalidaBasura.add(zsDato);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(
                ZSCMDColor.RED +
                "ERROR SISTEMA RUSO: " + e.getMessage() +
                ZSCMDColor.RESET
            );
        }
    }
}
