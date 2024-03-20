package datos;
import java.io.IOException;

import interfaz_consola.interfaz;
import laboratorio.experimento;
import laboratorio.dosis;



public class gestor_experimento {
    private experimento experimentoActual;
    private String archvioActual;
    

    public gestor_experimento(){
        experimentoActual=null;
    }
    public void abrirArchivo_ConExperimentos(interfaz interfaz,gestor_Archivo gestorarchivo){
    
        
        String rutaArchivo=interfaz.leerTexto("ingresame la ruta cvs :");
        try{
            experimentoActual=gestorarchivo.cargarExperimentos(rutaArchivo);
            interfaz.mostrarMensaje("poblacion cargada exitosamente");
        }catch(IOException e){
            interfaz.mostrarMensaje("error al cargar el archivo"+e.getMessage());
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        }

        
    
    public void crearNuevoExperimento( interfaz interfaz){
        String nombre = interfaz.leerTexto("Dama negra");
        
        String fechaInicio = interfaz.leerTexto("Fecha de inicio (dd/MM/yyyy):");
        int cantidadIncialBacterias = interfaz.leerEntero(30);
        int temperatura = interfaz.leerEntero(30);
        String luminosidad = interfaz.leerTexto("Visualización de la luminosidad:");
        if (temperatura < 30) {
        interfaz.mostrarMensaje(luminosidad + " baja");
        } else if (temperatura > 30) {
            interfaz.mostrarMensaje(luminosidad + " alta");
        } else if (temperatura == 30) {
            interfaz.mostrarMensaje(luminosidad + " media");
        
        return;

        }
        experimentoActual= new experimento(nombre, fechaInicio, fechaInicio, cantidadIncialBacterias, temperatura, luminosidad);
    }
    
    
    public void guardarExperimento(interfaz interfaz,gestor_Archivo gestor_Archivo){
        if (experimentoActual==null){
            interfaz.mostrarMensaje("no hay poblacion seleccionada");
            return;
        
        }
        if (archvioActual==null){
            guardarComo(interfaz,gestor_Archivo);
            return;
        }
        try{
            gestor_Archivo.guardarExperimento(experimentoActual, archvioActual);
        }catch(Exception e){
            throw new RuntimeException(e);

        }


    }
    public void guardarComo(interfaz interfaz,gestor_Archivo gestor_Archivo){
        if (experimentoActual==null){
            System.out.println("no hay poblacion seleccionada");
            return ;
        }
        String rutaArchivo=interfaz.leerTexto("ingrese el nombre del archivo:");
        try{
            gestor_Archivo.guardarExperimento(experimentoActual,rutaArchivo);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        interfaz.mostrarMensaje(rutaArchivo+"guardado exitosamente");


    }
    public void gestionarPoblacion(interfaz interfaz){ //gestionar significa dar un mandato??










    }
    public void guardarArchivo(interfaz interfaz,gestor_Archivo gestor_Archivo){
        if (experimentoActual==null){
            System.out.println("no hay poblacion seleccionada");
            return;
        }
        if (archvioActual==null){
            guardarComo(interfaz, gestor_Archivo);
            return;
        }try{
            gestor_Archivo.guardarArchivo(experimentoActual, archvioActual);
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    public void crearNuevaPoblacion(interfaz interfaz){
        
    
        
        String nombrePoblacion=interfaz.leerTexto("la dama negra");
        String cientifico =interfaz.leerTexto("NAOMMY");
        int cantidadInicialBacterias=interfaz.leerEntero("INGRESE LA CANTIDAD DE BACTERIAS INICIALES:");
        int temperatura=interfaz.leerEntero("INGRESE LA TEMPERATURA DE LA POBLAVION DE BACTERIA:");
        int Dias_Experimentacion=interfaz.leerEntero("ingrese el numero de experimentos ");
        if (Dias_Experimentacion<0 && Dias_Experimentacion>30){
            interfaz.mostrarMensaje("el numero de dias de procreacion es invalido");
            return;
        }
        experimentoActual=new experimento(nombrePoblacion, cientifico, nombrePoblacion, cantidadInicialBacterias, temperatura, cientifico);
        interfaz.mostrarMensaje("poblacion creada exitosamente:");







    }
    
    public void visualizarInfoPoblacion(interfaz interfaz){//seria esto lo mismo que ver detalles de la poblacion?
        
        if (experimentoActual==null){
            System.out.println("no hay poblacion seleccionada:");
            return;
        }
        
        interfaz.mostrarMensaje("nombre de la poblacion:"+experimentoActual.getPoblaciones());
        interfaz.mostrarMensaje("ingrese en nombre del cientifico responsable:"+experimentoActual.getNombre());
        interfaz.mostrarMensaje("ingrese la fecha de inicio:"+experimentoActual.getFechaInicio());
        interfaz.mostrarMensaje("ingrese la fecha de fin:"+experimentoActual.getFechaFin());
        interfaz.mostrarMensaje("ingrese la cantidad de inicio de bacteria:"+experimentoActual.getCantidadInicialBacterias());
        interfaz.mostrarMensaje("ingrese la temperaturade la poblacion de bacterias:"+experimentoActual.getTemperatura());
        interfaz.mostrarMensaje("ingrese los dias de experimentacion de las bacterias:"+experimentoActual.getLuminosidad());
        


    }

    
    public void borrarPoblacion(interfaz interfaz){
        if (experimentoActual==null){
            System.out.println("no hay poblacion seleccionada");
            return;

        }

    }
    public void verDestallesPoblacion(interfaz interfaz){
        if (experimentoActual==null){
            System.out.println("no hay poblacion seleccionada:");
            return;
        }
        
        interfaz.mostrarMensaje("nombre de la poblacion:"+experimentoActual.getPoblaciones());
        interfaz.mostrarMensaje("ingrese en nombre del cientifico responsable:"+experimentoActual.getNombre());
        interfaz.mostrarMensaje("ingrese la fecha de inicio:"+experimentoActual.getFechaInicio());
        interfaz.mostrarMensaje("ingrese la fecha de fin:"+experimentoActual.getFechaFin());
        interfaz.mostrarMensaje("ingrese la cantidad de inicio de bacteria:"+experimentoActual.getCantidadInicialBacterias());
        interfaz.mostrarMensaje("ingrese la temperaturade la poblacion de bacterias:"+experimentoActual.getTemperatura());
        interfaz.mostrarMensaje("ingrese los dias de experimentacion de las bacterias:"+experimentoActual.getLuminosidad());
        




    }
}





