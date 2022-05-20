/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_examen1p2;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos Mendez
 */
public class JuanMendez_Examen1P2 {

    static Scanner lea = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("administrar redes en C++, (JAVA) XD");
            System.out.println("1.- Agregar PC");
            System.out.println("2.- Ingresar a PC");
            opcion = lea.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese la direccion IP");
                String Ip = lea.next();
                System.out.println("Ingrese la mascara de red");
                String mascara = lea.next();
            }else{
                if (opcion == 2){
                    
                }
            }
        }
    }
}
