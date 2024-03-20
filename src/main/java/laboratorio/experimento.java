
package laboratorio;
import java.util.ArrayList;
import java.util.List;





public class experimento {
    
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private int cantidadInicialBacterias;
    private int temperatura;
    private String luminosidad;
    private List<poblacion_bacterias> poblaciones;

    public experimento(String nombre, String fechaInicio, String fechaFin, int cantidadInicialBacterias, int temperatura, String luminosidad) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadInicialBacterias = cantidadInicialBacterias;
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
        this.poblaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public int getCantidadInicialBacterias() {
        return cantidadInicialBacterias;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getLuminosidad() {
        return luminosidad;
    }

    public List<poblacion_bacterias> getPoblaciones() {
        return poblaciones;
    }

    public void agregarPoblacion(poblacion_bacterias poblacion) { //ESTA BIEN
        poblaciones.add(poblacion);
    }

    public void eliminarPoblacion(int indice) { //ESTA BIEN
        poblaciones.remove(indice);
    }
    //necesito crear el archivo de los experientos
    //me falta gestionapoblacion
    //visualizar poblacion y ver detalles
    @Override
    public String toString() {
        return "Experimento: " + nombre +
        "\nFecha de inicio: " + fechaInicio +
        "\nFecha de fin: " + fechaFin +
        "\nCantidad inicial de bacterias: " + cantidadInicialBacterias +
        "\nTemperatura: " + temperatura +
        "\nLuminosidad: " + luminosidad +
        "\nPoblaciones: " + poblaciones;
    }
    


    

}























    
    


