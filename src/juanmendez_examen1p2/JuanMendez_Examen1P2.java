/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_examen1p2;

import java.util.ArrayList;
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
        ArrayList<PCS> pc = new ArrayList();
        ArrayList<String> ipXD = new ArrayList();
        boolean opcion = true;
        while (opcion) {
            int opcion1 = Integer.parseInt(
                    JOptionPane.showInputDialog("simulador para administrar redes en C++ (JAVA) Xd\n"
                            + "1.- Agregar PC \n"
                            + "2.- Ingresar a pc \n"
                            + "3.- Salir \n")
            );
            switch (opcion1) {
                case 1:
                    boolean si = true;
                    while (si) {
                        int opcion2 = Integer.parseInt(
                                JOptionPane.showInputDialog("simulador para administrar redes en C++ (JAVA) Xd\n"
                                        + "1.- Crear PC \n"
                                        + "2.- Eliminar Pc \n"
                                        + "3.- Salir \n")
                        );
                        switch (opcion2) {
                            case 1:
                                int tipo = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de computadora va a crear? \n"
                                        + "1.- Computadora de escritorio"
                                        + "2.- Computadora de Laptop")
                                );
                                switch (tipo) {
                                    case 1:
                                        String tipow = "HDD";
                                        String IP = JOptionPane.showInputDialog("Ingrese la direccion IP de la computadora");
                                        String mascara = JOptionPane.showInputDialog("Ingrese la mascara de la computadora");
                                        String hotsname = JOptionPane.showInputDialog("Ingrese la hotsname de la computadora");
                                        int RAM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de RAM que dispone su PC"));
                                        int almacenamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de almacenamiento que dispone su Pc"));
                                        Escritorio es = new Escritorio(tipow, IP, mascara, hotsname, RAM, almacenamiento);
                                        ipXD.add(IP);
                                        pc.add(es);

                                        break;
                                    case 2:
                                        String IP2 = JOptionPane.showInputDialog("Ingrese la direccion IP de la computadora");
                                        String mascara2 = JOptionPane.showInputDialog("Ingrese la mascara de la computadora");
                                        String hotsname2 = JOptionPane.showInputDialog("Ingrese la hotsname de la computadora");
                                        int RAM1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de RAM que dispone su PC"));
                                        int almacenamiento1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de almacenamiento que dispone su Pc"));
                                        String marca = JOptionPane.showInputDialog("Ingrese la marca de su Laptop");
                                        String definicion = JOptionPane.showInputDialog("Ingrese la definicion de Laptop");
                                        laptop a = new laptop(marca, definicion, IP2, mascara2, hotsname2, RAM1, almacenamiento1);
                                        ipXD.add(IP2);
                                        pc.add(a);
                                }
                                break;
                            case 2:
                                int re = Integer.parseInt(JOptionPane.showInputDialog("Inrgese la posicion que desea remover"));
                                pc.remove(re);
                                break;
                            case 3:
                                si = false;
                        }
                    }
                    break;
                case 2:
                    int m = Integer.parseInt(JOptionPane.showInputDialog("Usted selecciono la opcion de (Ingresar a la pc) Ingrese el numero de acuerdo a lo que deseada \n"
                            + "1.- Ping_<ip> \n"
                            + "2.- Show \n"
                            + "3.- exit \n"));
                    boolean xd = true;
                    while (xd) {
                        switch (m) {
                            case 1:
                                String n = JOptionPane.showInputDialog("Nombre:");
                                String ip = JOptionPane.showInputDialog("Direccion IP: ");
                                String masca = JOptionPane.showInputDialog("Mascara: ");
                                JOptionPane.showConfirmDialog(null, binario(ip));
                                JOptionPane.showConfirmDialog(null, masca);
                                for (int i = 0; i < ipXD.size(); i++){
                                    if (ip.contains(ipXD.get(i))){
                                        JOptionPane.showConfirmDialog(null, "El ping es valido");
                                    }else{
                                        JOptionPane.showConfirmDialog(null, "Ping invalido");
                                                
                                    }
                                        
                                }
                                break;
                            case 2:
                                System.out.println("Computadoras creadas actualmente");
                                for (Object o : pc) {
                                    System.out.println(""+ o);
                                }
                                break;
                            case 3:
                                xd = false;
                        }
                    }

                    break;
                case 3:
                    opcion = false;

            }
        }
    }

    public static String binario(String ip) {
        String resultado = "";
        if (ip.contains("192.14.65.86")) {
            resultado = "11000000.00001110.01000001.01010110";
        } else {
            if (ip.contains("192.14.64.128")) {
                resultado = "11000000.00001110.01000010.10000000";
            }

        }
        return resultado;
    }

    public static int masca(String mascara) {
        int contador = 0;
        if (mascara.contains("11000000.00001110.01000010.10000000")) {
            contador = 24;
        }

        return contador;
    }
}
