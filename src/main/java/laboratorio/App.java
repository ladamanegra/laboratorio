


package laboratorio;
import java.io.IOException;

import datos.gestor_Archivo;
import  datos.gestor_experimento;
import interfaz_consola.interfaz;



/*
 * clase princcipal de la aplicacion
 */
public class App {
    /**
    * Método principal de la aplicación.
    *
    * @param args Argumentos de la aplicación.
    * @throws IOException
    */
    public static void main(String[] args) {
        interfaz interfazConsola = new interfaz();
        gestor_experimento gestorExperimento= new gestor_experimento();
        gestor_Archivo gestorArchivo = new gestor_Archivo();

        boolean salir =false;
        while(!salir){
            interfazConsola.mostrarMensaje("\nMenú principal:");
            interfazConsola.mostrarMensaje("\nrealizar experimentos con bacterias");
            interfazConsola.mostrarMensaje("1.Abrir archivo con  experimentos");
            interfazConsola.mostrarMensaje("2.crear experimento:");
            interfazConsola.mostrarMensaje("3.guardar Experimento");
            interfazConsola.mostrarMensaje("4.guardar como:");
            interfazConsola.mostrarMensaje("5.gestionar poblacion");
            interfazConsola.mostrarMensaje("6.guardar archivo");
            interfazConsola.mostrarMensaje("7.crear poblacion");
            interfazConsola.mostrarMensaje("4.visualizar poblacion");
            interfazConsola.mostrarMensaje("5.borrar poblacion");
            interfazConsola.mostrarMensaje("5.ver detalles de la poblacion");
            interfazConsola.mostrarMensaje("6.salir");
            /*1. Abrir un archivo que contenga un experimento
            2. Crear un nuevo experimento
            3. Crear una población de bacterias y añadirla al experimento actual
            4. Visualizar los nombres de todas las poblaciones de bacterias del experimento
            actual
            5. Borrar una población de bacterias del experimento actual
            6. Ver información detallada de una población de bacterias del experimento actual
            7. Guardar (se supone que para usar esta opción previamente hemos abierto un
            archivo)
            8. Guardar como
            */

            int opcion=interfazConsola.leerEntero("ingrese la opcion deseada:");
            switch (opcion) {
            case 1:
            gestorExperimento.abrirArchivo_ConExperimentos(interfazConsola,gestorArchivo);
            break;
            case 2:
            gestorExperimento.crearNuevoExperimento(interfazConsola);
            break;
            case 3:
            gestorExperimento.guardarExperimento(interfazConsola,gestorArchivo);
            break;
            case 4:
            gestorExperimento.guardarComo(interfazConsola,gestorArchivo);
            break;
            case 5:
            gestorExperimento.gestionarPoblacion(interfazConsola);
            case 6:
            gestorExperimento.guardarArchivo(interfazConsola,gestorArchivo);
            break;
            case 7:
            gestorExperimento.crearNuevaPoblacion(interfazConsola);
            break;
            case 8:
            gestorExperimento.visualizarInfoPoblacion(interfazConsola);
            break;
            case 9:
            gestorExperimento.borrarPoblacion(interfazConsola);
            break;
            case 10:
            gestorExperimento.verDestallesPoblacion(interfazConsola);
            break;
            case 11:
            salir =true;
            interfazConsola.mostrarMensaje("opcion invalidad intente de nuevo ");

            }
        }
    }
}
            
            
            
                
                
        
            
        
        
        
        
        
        
    













            









        


        
    

        
        

