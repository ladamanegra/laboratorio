package interfaz_consola;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class interfaz {

    
    
    
    private Scanner scanner;
    private SimpleDateFormat formatoFecha;

    public interfaz(){
        scanner = new Scanner(System.in);
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

    }
    
    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public int leerEntero(String  mensaje) {
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
    public int  leerEntero(int mensaje ){
        System.out.println(mensaje);
        int valor =scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
    public double leerDouble(double  mensaje) {
        System.out.print(mensaje);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    public Date leerFecha(Date mensaje) {
        System.out.print(mensaje);
        String fecha = scanner.nextLine();
    
        try {
            return formatoFecha.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Intente de nuevo.");
            
            return leerFecha(mensaje);
        
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public boolean leerBoolean(String s) {
        System.out.print(s);
        String valor = scanner.nextLine();
        if (valor.equalsIgnoreCase("S")) {
            return true;
        } else if (valor.equalsIgnoreCase("N")) {
            return false;
        } else {
            System.out.println("Valor inválido. Intente de nuevo.");
            return leerBoolean(s);
        }
    }}

    
    
    

    

    
    




