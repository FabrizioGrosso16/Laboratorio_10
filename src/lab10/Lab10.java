package lab10;
import java.util.ArrayList;
import java.util.List;
public class Lab10 {
    private static List<Camara> CelularesConCam = new ArrayList<>();
    private static List<ReproductorDeMusica> CelularesConRepro = new ArrayList<>();
    private static List<NavegadorDeInternet> CelularesConNav = new ArrayList<>();

    public static void main(String[] args) {
        Smartphone celular1 = new Smartphone("Xiaomi", "RedmiNote 9");
        CelularesConRepro.add(celular1);
        CelularesConCam.add(celular1);
        Smartphone celular2 = new Smartphone("Xiaomi", "RedmiNote 8");
        CelularesConCam.add(celular2);
        Smartphone celular3 = new Smartphone("Xiaomi", "RedmiNote 10");
        CelularesConNav.add(celular3);
        Smartphone celular4 = new Smartphone("Oppo", "A57");
        CelularesConRepro.add(celular4);
         CelularesConNav.add(celular4);
        Smartphone celular5 = new Smartphone("Oppo", "A77");
        CelularesConRepro.add(celular5);
        Smartphone celular6 = new Smartphone("Honor", "X7");
        CelularesConNav.add(celular6);
        CelularesConCam.add(celular6);
    }

    public static void agregarCam(Camara camarita) {
        CelularesConCam.add(camarita);
    }

    public static void agregarRepro(ReproductorDeMusica repro) {
        CelularesConRepro.add(repro);  
    }

    public static void agregarInt(NavegadorDeInternet inter) {
        CelularesConNav.add(inter);  
    }     
}

