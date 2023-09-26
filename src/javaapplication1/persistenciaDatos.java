//Hecho por Nicolás Alejandro Diosa
package javaapplication1;
import java.io.*;
import java.util.*;

public class persistenciaDatos {
    public void guardarDatos(){
        FileWriter archivo;
        PrintWriter escritor;
        Map<String,String> x = new HashMap();
        
        try{
            archivo = new FileWriter ("Direccion del archivo en el computador");
            escritor = new PrintWriter (archivo);
            escritor.print(x);
        }
        catch (Exception e){
            System.out.println("Error ");
        }
    }
    public void LeerDatos(){
        FileReader archivo;
        BufferedReader lector;
        Map<String,String> x = new HashMap();
        
        try{
            archivo = new FileReader ("Direccion del archivo en el computador");
            if (
                archivo.ready()){lector = new BufferedReader (archivo);
                String cadena;
                while((cadena = lector.readLine())!= null){
                    System.out.println(cadena);
                }
            }
            else {System.out.println("El archivo no está listo para ser leido");}
            
        }
        catch (Exception e){
            System.out.println("Error ");
        }
    }
}
