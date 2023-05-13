/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udls.archivos.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author 52477
 */
public class GestorArchivo {
    
    
    public static String Leer(String ruta){
        String contenido = "";
        try{
            File archivo = new File(ruta);
            //Se lee el archivo
            FileReader lector = new FileReader(archivo);
            //Se coloca de manera temporal todo el contenido del archivo
            BufferedReader br = new BufferedReader(lector);
            //Leer cada linea y "unirlo"
            String Linea = ruta;
            while((Linea= br.readLine()) != null){
                contenido+=Linea+"\n";
            }
            //Se cierran los elementos
            br.close();
            lector.close();
        }
        catch(Exception e){
            e.printStackTrace();
            contenido = "Error en la lectura del archivo";
        
        }
        
        return contenido;
    }
}
