package ZSBusinessComponent.ZSEntities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import ZSBusinessComponent.ZSFactoryBL;
import ZSDataAccessComponent.ZSDAOs.ZSHormigaDAO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppConfig;
import ZSInfrastructureComponent.ZSAppException;
import ZSInfrastructureComponent.ZSTools.ZSCMDColor;

public abstract class ZSEntomologo {
    // Refactorización: se eliminaron los siguientes atributos: private String zsEstado;
    // private ZSGenoAlimento zsGenoma;
    private String zsUsuario;
    private String zsContrasena;
    private String zsNombre;
    

    public ZSEntomologo(){}

    public ZSEntomologo(String zsUsuario, String zsContrasena, String zsNombre) {
        this.zsUsuario    = zsUsuario   ;
        this.zsContrasena = zsContrasena;
        this.zsNombre     = zsNombre    ;
    }

    public String getZsUsuario() {
        return zsUsuario;
    }

    public void setZsUsuario(String zsUsuario) {
        this.zsUsuario = zsUsuario;
    }

    public String getZsContrasena() {
        return zsContrasena;
    }

    public void setZsContrasena(String zsContrasena) {
        this.zsContrasena = zsContrasena;
    }

    public String getZsNombre() {
        return zsNombre;
    }

    public void setZsNombre(String zsNombre) {
        this.zsNombre = zsNombre;
    }

    //Refactorización: se creó el método zsLogin
    public static void zsLogin() {

        Scanner zsScLogin = new Scanner(System.in);

        while (true) {

            System.out.println("===== LOGIN ENTOMOLOGO =====");

            System.out.print("Usuario: ");
            String usuario = zsScLogin.nextLine().trim();

            System.out.print("Contraseña: ");
            String contrasena = zsScLogin.nextLine().trim();

            boolean auth1 = usuario.equals("patmic") 
                         && contrasena.equals("123");

            boolean auth2 = usuario.equals("ZunigaSebastian") 
                         && contrasena.equals("1706");

            if (auth1 || auth2) {
                System.out.println(ZSCMDColor.GREEN +"Acceso concedido.\n" + ZSCMDColor.RESET);
                break;
            }

            System.out.println(ZSCMDColor.RED + "ERROR DE AUTENTICACIÓN");
            System.out.println("Usuario o contraseña incorrectos.");
            System.out.println("Por favor, intente nuevamente.\n" + ZSCMDColor.RESET);
            zsScLogin.close();
        }
    }

    public void zsCosecharDato()
            throws ZSAppException {
        // Tipos válidos de hormiga
        Set<String> zsTiposValidos = Set.of(
                "HLarva",
                "HZángano",
                "HSoldado",
                "HObrera",
                "HReina",
                "HRastreadora"
        );

        // Conjuntos para evitar duplicados y mantener orden
        List<String> zsHormigasValidas = new ArrayList<>();
        Set<String>  zsDatosBasura     = new LinkedHashSet<>();


        try (BufferedReader br = new BufferedReader(new FileReader(ZSAppConfig.ZSANTNEST))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                // Separar por comas
                String[] zsTokens = linea.split(",");

                for (String zsToken : zsTokens) {

                    String zsDato = zsToken.trim();

                    if (zsDato.isEmpty()) continue;

                    if (zsTiposValidos.contains(zsDato)) {
                        zsHormigasValidas.add(zsDato);
                    } else {
                        zsDatosBasura.add(zsDato);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(ZSCMDColor.RED + "ERROR AL LEER EL ARCHIVO: " + e.getMessage() + ZSCMDColor.RESET);
            return;
        }
        
        zsUpdateHormiga(zsHormigasValidas);
        
        
    }

    private void zsImprimirReporteCosecha(List<String> zsHormigasValidas, Set<String> zsDatosBasura) {
        System.out.println("[*] Hormigas");
    }

//Refactorización: se creó el método zsUpdateHormigas
protected void zsUpdateHormiga(List<String> zsHormigasValidas)
        throws ZSAppException {

    ZSFactoryBL<ZSHormigaDTO> zsFactoryBL =
            new ZSFactoryBL<>(ZSHormigaDAO.class);

    int zsContadorLarva   = 1;
    int zsContadorZangano = 1;

    for (String tipo : zsHormigasValidas) {

        ZSHormigaDTO zsHormiga = new ZSHormigaDTO();

        if ("HLarva".equalsIgnoreCase(tipo)) {

            zsHormiga.setIdZSHormigaTipo(1);
            zsHormiga.setZSNombre("HormigaLarva(" + zsContadorLarva++ + ")");
            zsFactoryBL.zsAdd(zsHormiga);
        }
        else if ("HZángano".equalsIgnoreCase(tipo)) {

            zsHormiga.setIdZSHormigaTipo(5);
            zsHormiga.setZSNombre("HormigaZangano(" + zsContadorZangano++ + ")");
            zsFactoryBL.zsAdd(zsHormiga);
        }
    }
}

};

    

    
    

