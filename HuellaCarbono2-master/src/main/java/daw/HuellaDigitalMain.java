/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import conexion_http.ConexionHTTP;
import java.io.IOException;
import java.util.Scanner;
import modelos.Huella;
import serviciojson.JsonService;

/**
 *
 * @author Fer
 */
public class HuellaDigitalMain {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la pagina wweb que deseas medir la huella de carbono");

        String urlUsuario = teclado.nextLine();

        String urlBase = "https://api.websitecarbon.com/site?url=";



        String fichero = ConexionHTTP.peticionHttpGet(urlBase + urlUsuario);
        
        Huella ejemplo = null;

        try {
            
            ejemplo = (Huella) JsonService.stringToPojo(fichero, Huella.class);

        } catch (InvalidFormatException ife) {
     }

        System.out.println(ejemplo);
        System.out.println("-------------");
        

    }
}
