package datos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

import laboratorio.experimento;

/*
 * la clase gestor_Archivo se encargara de  de proporcionar metodos
 * para cargar  y guardar meotodos para  cargar  una poblacion de ratones desde hacia
 * un archivo
 */
public class gestor_Archivo {
    
    SimpleDateFormat dateFormat;
    
    
    
    
    
    /*CONSTRUYE UN OBJETO GESTOR ARCHIVO  INCIALIZA LOS
     * FORMATOS DE FECHA COMO "DD/MM/MMMM"
    */
    public gestor_Archivo(){
        dateFormat=new SimpleDateFormat("DD/MM/MMMM");


    }
    /*CARGAR LAS POBLACION DE  BACTERIAS DESDE UN ARCHIVO ESPECIFICO
     *
     */
    /**
     * @param archivo  el archivo que contienen los datos de la poblacion
     * de experimentos.
     * @return el objeto de experimentos cargados
     */
    public experimento cargarExperimentos(String archivo) throws FileNotFoundException {
        File file = new File(archivo);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            //String experimento = ;
            
            System.out.println("no se que escribir tengo sueño");
            
            // Add your code here
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null; // Replace null with the appropriate return statement
    }    public void guardarExperimento(experimento experimento,String archivo){
    


        }
        public   void   guardarArchivo(experimento experimento,String ar){

        }
        
    

    
        
        
    




}
