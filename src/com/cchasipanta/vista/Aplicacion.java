/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cchasipanta.vista;
//crear un programa que abra un archivo prueba txt.
//  escriba en el archivos una serie de caracteres desde el caracter a hasta el caracter z , 

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

//caracter por caracter
/**
 *
 * @author LAB4-PC7
 */
public class Aplicacion {
    public static void main(String[] args) {
        String nomArchivo = "prueba.txt";
        FileWriter escribir;
        try {
            escribir = new FileWriter(nomArchivo);
            for(char c='a'; c<='z'; c++){
                escribir.write(c);
            }
            escribir.close();
            
        } catch (IOException e) {
            System.out.println("Imposible abrir el archivo");
        }
        
        FileReader leer;
        int c;
        try {
            leer = new FileReader(nomArchivo);
            c = leer.read();
            while(c!=-1){
                JOptionPane.showMessageDialog(null, (char) c);
                c = leer.read();
            }
            leer.close();
            
        } catch (IOException e) {
            System.out.println("Imposible abrir el archivo");
        }
    }
}
