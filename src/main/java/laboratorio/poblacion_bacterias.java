package laboratorio;

public class poblacion_bacterias {
    private String cientifico;
    private  int cantidad_inicial;
    private int dia_incremento;
    private int cantidad_incremento;
    private int cantidad_final;
    public poblacion_bacterias(String cientifico,int cantidad_inicial, int dia_incremento, int cantidad_incremento) {
        this.cientifico=cientifico;
        this.cantidad_inicial = cantidad_inicial;
        this.dia_incremento = dia_incremento;
        this.cantidad_incremento = cantidad_incremento;
        this.cantidad_final = cantidad_inicial + (dia_incremento * cantidad_incremento);
    }
    public String getcientifico(){
        return cientifico;
    }
    public void setcientifico(String cientifico){
        this.cientifico=cientifico;
    }
    public int getCantidad_inicial() {
        return cantidad_inicial;
    }

    public void setCantidad_inicial(int cantidad_inicial) {
        this.cantidad_inicial = cantidad_inicial;
    }

    public int getDia_incremento() {
        return dia_incremento;
    }

    public void setDia_incremento(int dia_incremento) {
        this.dia_incremento = dia_incremento;
    }

    public int getCantidad_incremento() {
        return cantidad_incremento;
    }

    public void setCantidad_incremento(int cantidad_incremento) {
        this.cantidad_incremento = cantidad_incremento;
    }

    public int getCantidad_final() {
        return cantidad_final;
    }

    public void setCantidad_final(int cantidad_final) {
        this.cantidad_final = cantidad_final;
    }
    public void calcularDosis_diaria(){

    }
    @Override
    public String toString() {
        return "poblacion_bacterias{" +
                "cantidad_inicial=" + cantidad_inicial +
                ", dia_incremento=" + dia_incremento +
                ", cantidad_incremento=" + cantidad_incremento +
                ", cantidad_final=" + cantidad_final +
                '}';
    }

}
