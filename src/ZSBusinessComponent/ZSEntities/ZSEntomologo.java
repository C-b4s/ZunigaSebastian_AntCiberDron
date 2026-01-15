package ZSBusinessComponent.ZSEntities;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import ZSAppComponent.ZSConsoleApp.ZSSistemaRuso;
import ZSBusinessComponent.ZSInterfaces.IZSEntomologo;
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
    public void zsLogin() {

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
public List<ZSHormiga> zsEtlAntNest() throws InterruptedException {

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
    public List<ZSAlimento> zsEtlAntFood() throws InterruptedException {

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



    private List<ZSHormiga> zsMapearHormigas(List<String> zsDatos) {
    List<ZSHormiga> zsLista = new ArrayList<>();

    int zsLarva = 1;
    int zsZangano = 1;

    for (String d : zsDatos) {

        if ("HLarva".equalsIgnoreCase(d)) {
            zsLista.add(
                new ZSHLarva("HormigaLarva(" + zsLarva++ + ")")
            );
        }
        else if ("HZángano".equalsIgnoreCase(d)) {
            zsLista.add(
                new ZSHZangano("HormigaZangano(" + zsZangano++ + ")")
            );
        }
    }
    return zsLista;
}


    private List<ZSAlimento> zsMapearAlimentos(List<String> zsDatos) {

    List<ZSAlimento> zsLista = new ArrayList<>();

    int zsContadorNectarivoro = 1;
    int zsContadorOmnivoro    = 1;

    for (String d : zsDatos) {


        // ───── Nectarívoro ─────
        if ("ANectarivoro".equalsIgnoreCase(d)) {

            zsLista.add(new ZSNectarivoro("AlimentoNectarivoro(" + zsContadorNectarivoro++ + ")"));
        }
        // ───── Omnívoro ─────
        else if ("AOmnivoro".equalsIgnoreCase(d)) {

            zsLista.add(new ZSOmnivoro("AlimentoOmnivoro(" + zsContadorOmnivoro++ + ")"));
        }
    }

    return zsLista;
}

public ZSHormiga zsAlimentarAnt(
        ZSEntomologo entomologo,
        ZSHormiga hormiga,
        ZSAlimento alimento
) throws ZSAppException {

    if (entomologo == null)
        throw new ZSAppException("No existe entomólogo");

    if (hormiga == null)
        throw new ZSAppException("No existe la hormiga");

    if (alimento == null)
        throw new ZSAppException("No existe el alimento");
    
    if ("OMNIVORO".equalsIgnoreCase(alimento.getZsData().getZsNombre())) {
        hormiga.getZsData().setIdZSHormigaTipo(5);
        hormiga.getZsData().setZSIdEstado(1);
    }else{
        hormiga.getZsData().setZSIdEstado(2);
    } 

    return hormiga;
}


    // ───────────────────────────────────────
    // Impresión elegante
    // ───────────────────────────────────────

    private void zsImprimirCosecha(
            String titulo,
            List<String> validos,
            Set<String> basura) throws InterruptedException {

        System.out.println(
            ZSCMDColor.CYAN +
            "\n╔══════════════════════════════╗"
        );
        System.out.println("║  COSECHA DE " + titulo);
        System.out.println("╚══════════════════════════════╝" +
            ZSCMDColor.RESET);

        System.out.println(
            ZSCMDColor.GREEN + "  [*] " + titulo +": " + ZSCMDColor.RESET);
        for (String v : validos) {
            ZSCMDProgress.showSpinner();;
            System.out.println(ZSCMDColor.BLUE + v + ZSCMDColor.RESET);
        for (String b : basura) {
            ZSCMDProgress.showSpinner();
            System.out.println(ZSCMDColor.RED + "    • " + b + ZSCMDColor.RESET);
        }
    }
  }
};

    

