/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Trabajito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. DECLARACION DE VARIABLES 
        String apellido;
        String nombre;
        String semestre;
        Scanner input = new Scanner(System.in);
        //; fin de instruccion en java
        //2. CAPTURA DE VARIABLES
        System.out.println("introduce tu nombre:");
        nombre = input.nextLine();
        System.out.println("introduce tu apellido:");
        nombre = input.nextLine();
        System.out.println("introduce tu semestre:");
        nombre = input.nextLine();
                
        System.out.println(nombre);       
        System.out.println(apellido);       
        System.out.println(semestre);       
        
    }

}
