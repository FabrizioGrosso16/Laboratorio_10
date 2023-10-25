package lab10;

/**
 *
 * @author User001
 */
public class Smartphone implements Camara, ReproductorDeMusica, NavegadorDeInternet {

    public Smartphone(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    public String Marca;
    public String Modelo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public void GrabarVideo() {
    }

    @Override
    public void TomarFoto() {
        
    }

    @Override
    public void Buscar() {
        
    }

    @Override
    public void Actualizar() {
        
    }

    @Override
    public void Reproducir() {
        
    }

    @Override
    public void Detener() {
        
    }
}
