/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_tipos_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte califa;
        califa = 100;
        //califa = 128;
        //califa = -128;
        //califa = -129;
        int valor;
        valor = Integer.MAX_VALUE;
        System.out.println(valor + 1);
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        
        valor = Integer.SIZE;
        System.out.println("size");
        System.out.println(valor);
        
        valor = Integer.BYTES;
        System.out.println("byte");
        System.out.println(valor);
        
        char caracter = 'a';
        System.out.println(caracter);
        System.out.println(caracter + 0);
    }

}
