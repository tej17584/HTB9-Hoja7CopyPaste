package hojadetrabajo9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HojaDeTrabajo9 {

    /**
     * @param arg
     */
    public static void main(String [] arg) {
        
        int decision,implementacion=1; 
        String paciente="";
        boolean power = true, inicio = true;
        Scanner teclado = new Scanner(System.in);
        Procesos procesos = new Procesos();        
        
        System.out.println("Bienvenido al programa!");
        System.out.println("Ingrese la implementacion que desea utilizar:");
        System.out.println("1. SplayTree");
        System.out.println("2. Red Black Tree\n");
        System.out.print("Decision: ");       
        
        while (inicio) {
        
            while (!teclado.hasNextInt())   
                
                {
                    System.err.println("\nCaracter no valido"); 

                    System.out.print("Por favor ingrese una opcion valida: ");
                    teclado.next();            
                }

            decision = teclado.nextInt();
            
            if (decision==1) {
                
                procesos.diccionarioSN();
                power = false;
                
            } else if (decision==2) {
                
                System.out.println("Hace tu implementacion Tejada hahaha");
                                               
            }             
        }
    }
}
