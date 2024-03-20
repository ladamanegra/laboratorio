package laboratorio;

public class dosis {
    
    private int cantidad_inicial;
    private int dia_incremento;
    private int cantidad_dia_incremento;

    public dosis(int cantidad_inicial, int dia_incremento, int cantidad_dia_incremento) {
        this.cantidad_inicial = cantidad_inicial;
        this.dia_incremento = dia_incremento;
        this.cantidad_dia_incremento = cantidad_dia_incremento;
    }

    public int getCantidadInicial() {
        return cantidad_inicial;
    }

    public void setCantidadInicial(int cantidad_inicial) {
        this.cantidad_inicial = cantidad_inicial;
    }

    public int getDiaIncremento() {
        return dia_incremento;
    }

    public void setDiaIncremento(int dia_incremento) {
        this.dia_incremento = dia_incremento;
    }

    public int getCantidadDiaIncremento() {
        return cantidad_dia_incremento;
    }

    public void setCantidadDiaIncremento(int cantidad_dia_incremento) {
        this.cantidad_dia_incremento = cantidad_dia_incremento;
    }

    

    @Override
    public String toString() {
        return "dosis{" +
                "cantidad_inicial=" + cantidad_inicial +
                ", dia_incremento=" + dia_incremento +
                ", cantidad_dia_incremento=" + cantidad_dia_incremento +
                '}';
    }
}

