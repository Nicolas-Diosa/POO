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
}
