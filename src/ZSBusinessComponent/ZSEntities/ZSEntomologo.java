package ZSBusinessComponent.ZSEntities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import ZSAppComponent.ZSConsoleApp.ZSSistemaRuso;
import ZSBusinessComponent.ZSFactoryBL;
import ZSBusinessComponent.ZSInterfaces.IZSEntomologo;
import ZSDataAccessComponent.ZSDAOs.ZSAlimentoDAO;
import ZSDataAccessComponent.ZSDAOs.ZSHormigaDAO;
import ZSDataAccessComponent.ZSDTOs.ZSAlimentoDTO;
import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSInfrastructureComponent.ZSAppConfig;
import ZSInfrastructureComponent.ZSAppException;
import ZSInfrastructureComponent.ZSTools.ZSCMDColor;
import ZSInfrastructureComponent.ZSTools.ZSCMDProgress;

public abstract class ZSEntomologo implements IZSEntomologo{
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


    @Override
public List<ZSHormiga> zsEtlAntNest() {

    Set<String> tiposValidosHormiga = Set.of(
        "HLarva",
        "HZángano",
        "HSoldado",
        "HObrera",
        "HReina",
        "HRastreadora"
    );

    List<String> zsValidos = new ArrayList<>();
    Set<String>  basura  = new LinkedHashSet<>();

    ZSSistemaRuso zsSistemaRuso = new ZSSistemaRuso();
    zsSistemaRuso.zsCosecharArchivo(
        ZSAppConfig.ZSANTNEST,
        tiposValidosHormiga,
        zsValidos,
        basura
    );

    zsImprimirCosecha("HORMIGAS", zsValidos, basura);
    return zsMapearHormigas(zsValidos);
}

    

    @Override
    public List<ZSAlimento> zsEtlAntFood() {

        Set<String> tiposValidosAlimento = Set.of(
            "Nectarívoros",
            "Omnívoro"
        );

        List<String> zsValidos = new ArrayList<>();
        Set<String>  zsBasura  = new LinkedHashSet<>();

        ZSSistemaRuso zsSistemaRuso = new ZSSistemaRuso();
        zsSistemaRuso.zsCosecharArchivo(
        ZSAppConfig.ZSFOODNEST,
        tiposValidosAlimento,
        zsValidos,
        zsBasura
    );

    zsImprimirCosecha("ALIMENTOS", zsValidos, zsBasura);

    return zsMapearAlimentos(zsValidos);
}


    // ───────────────────────────────────────
    // Mapeo dominio
    // ───────────────────────────────────────

    private List<ZSHormiga> zsMapearHormigas(List<String> datos) {
    List<ZSHormiga> lista = new ArrayList<>();

    int larva = 1;
    int zangano = 1;

    for (String d : datos) {

        if ("HLarva".equalsIgnoreCase(d)) {
            lista.add(
                new ZSHLarva("HormigaLarva(" + larva++ + ")")
            );
        }
        else if ("HZángano".equalsIgnoreCase(d)) {
            lista.add(
                new ZSHZangano("HormigaZangano(" + zangano++ + ")")
            );
        }
    }
    return lista;
}

}
    private List<ZSAlimentoDTO> zsMapearAlimentos(List<String> datos) {

    List<ZSAlimentoDTO> lista = new ArrayList<>();

    int zsContadorNectarivoro = 1;
    int zsContadorOmnivoro    = 1;

    for (String d : datos) {

        ZSAlimentoDTO zsAlimento = new ZSAlimentoDTO();

        // ───── Nectarívoro ─────
        if ("ANectarivoro".equalsIgnoreCase(d)) {

            zsAlimento.setIdZSAlimento(4);
            zsAlimento.setZSNombre(
                "AlimentoNectarivoro(" + zsContadorNectarivoro++ + ")"
            );
        }
        // ───── Omnívoro ─────
        else if ("AOmnivoro".equalsIgnoreCase(d)) {

            zsAlimento.setIdZSAlimento(3);
            zsAlimento.setZSNombre(
                "AlimentoOmnivoro(" + zsContadorOmnivoro++ + ")"
            );
        }
        else {
            continue;
        }

        lista.add(zsAlimento);
    }

    return lista;
}


    // ───────────────────────────────────────
    // Impresión elegante
    // ───────────────────────────────────────

    private void zsImprimirCosecha(
            String titulo,
            List<String> validos,
            Set<String> basura) {

        System.out.println(
            ZSCMDColor.CYAN +
            "\n╔══════════════════════════════╗"
        );
        System.out.println("║  COSECHA DE " + titulo);
        System.out.println("╚══════════════════════════════╝" +
            ZSCMDColor.RESET);

        System.out.println(
            ZSCMDColor.GREEN + "  ✔ VÁLIDOS:" + ZSCMDColor.RESET);
        for (String v : validos) {
            System.out.println("    • " + v);
        }

        System.out.println(
            ZSCMDColor.RED + "  ✖ BASURA:" + ZSCMDColor.RESET);
        for (String b : basura) {
            System.out.println("    • " + b);
        }
    }

    };

    

