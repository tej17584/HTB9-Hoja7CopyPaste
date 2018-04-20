package hojadetrabajo9;


import hojadetrabajo9.Association;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que contiene el metodo con el cual Splay Tree traduce el txt.
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 20.04.18
 */

public class Procesos {     
 public SplayTree st;
 
 public void setSplayTree(SplayTree arbolito){
     this.st=arbolito;
 }
    public void diccionarioSN() {
        
        File archivo = null;
        FileReader fr = null;
        FileReader frr = null;
        BufferedReader br = null;
        BufferedReader brr = null;
      
          
        try {
        // Apertura del fichero y creacion de BufferedReader para poder
        // hacer una lectura comoda (disponer del metodo readLine()).
        fr = new FileReader("freedict-eng-spa.txt");
        br = new BufferedReader(fr);
         
        // Lectura del fichero        
        String linea;
        String Key;
        String Value;
        int posicion;
        
        while((linea=br.readLine())!=null){                                    
            
            if (linea.contains(";")) { 
                linea = linea.substring(0,linea.indexOf(";"));                
                
            }
            
            if (linea.contains(",")){
                linea = linea.substring(0,linea.indexOf(","));
            }                        
            
            linea = linea.replace("\t", "-");
            linea = linea.replace(" ", "-");                        
                        
            posicion = linea.indexOf("-");           
            Key = linea.substring(0, posicion);            
            Value=linea.substring(posicion+1, linea.length());  
                      
            Association nuevoNodo = new Association(Key.toUpperCase(), Value.toUpperCase()); //se crea el "nodo" que se pondrá en el tree             
            st.insert(nuevoNodo);
            
        }
        
            System.out.println("Imprimiendo diccionario en PostOrder:\n");
            st.postorder();
            System.out.println("\n");
            
        //Iniciamos con la segunda lectura del archivo a traducir
        frr = new FileReader("texto.txt");
        brr = new BufferedReader(frr);
        Scanner scr = new Scanner(brr);  
         
        String linea2="";   
        String string="";
         
          while (scr.hasNextLine()) {
            linea2 += scr.nextLine();                        
        }                    
         
        string = linea2.replaceAll("\n", " ");        
          
        String WordList[] = string.split(" ");
         
        String resultado = "";
        String palabra;
        
            System.out.println("El achivo a traducir es:");            
        
        for(String p: WordList){
            
            palabra = p.toUpperCase();                
            System.out.print(palabra + " ");                            
            resultado += st.translate(palabra);     

        }                 
        
        System.out.println("\n\nTraduccion:");        
        System.out.println(resultado);                     
        
        } catch(IOException e){
            
      } finally {
            
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
         }         
      } 
    }         
    
}
