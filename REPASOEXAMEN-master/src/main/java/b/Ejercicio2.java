/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        
        String frase = JOptionPane.showInputDialog("Dime una frase por favor: "); //Pregunto la frase
        
        System.out.println("El tamaño de la frase es: " + frase.length()); //Tamanio de la frase
        
        System.out.println("La frase que has introducido es: " + frase); //Muestro la frase 

        char caracter = JOptionPane.showInputDialog("Introduce un caracter: ").charAt(0);
        
        
        
        //Llamo al metodo para buscar la primera ocurrencia 
        int posicionPrimer = buscarPrimeraOcurrencia(frase, caracter)+1;
        
        if (posicionPrimer == -1) { //Si me devuelve -1 significa que no ha encontrado el caracter
            
            System.out.println("El caracter: " +  caracter + "  no se encuentra en la frase");
            
        } else { //Si me devuelve una posicion positiva la imprimo 
            
            System.out.println("El índice de la primera ocurrencia del caracter: " +  caracter + " es: " + posicionPrimer);
        }
        
        
        System.out.println("");
        //Llamo al metodo para buscar las posiciones del caracter
        int[] posiciones = buscarPosicionesCaracter(frase, caracter);
        
        if (posiciones.length == 0) {
            
            System.out.println("El caracter " +  caracter +  " no se encontro anteriormente en la frase");
            
        } else {
            
            System.out.println("El caracter " +  caracter +  " se encuentra en las posiciones: ");
            
            //Imprimo todas las posiciones del caracter que estamos buscando
            for (int i = 0; i < posiciones.length; i++) {
                
                System.out.println(posiciones[i]+1);
            }
        }

        System.out.println("");
        System.out.println("Valor unicode de cada caracter de la frase: ");
        System.out.println("");
        
        
        //Imprime si los caracteres son mayusculas , minusculas o un digito
        for (int i = 0; i < frase.length(); i++) {
            
            char aux = frase.charAt(i); //Meto en aux al caracter de la posicion que toque y compruebo
            
            if (Character.isUpperCase(aux)) {  //Si es mayuscula
                
                System.out.println(aux + " es una letra mayuscula");
                
            } else if (Character.isLowerCase(aux)) { //Si es minuscula
                
                System.out.println(aux + " es una letra minuscula");
                
            } else if (Character.isDigit(aux)) { //Si es un digito
                
                System.out.println(aux + " es un dígito");
                
            }
        }
        
        System.out.println("");
        String sinEspacios = frase.replaceAll("\\s+", "");//Remplazo los espacios
        
        System.out.println("");
        System.out.println("La frase sin espacios es: " + sinEspacios); //Imprimo al frase sin espacios
        
        System.out.println("");
        System.out.println("El tamanio de la frase sin espacios es: " + sinEspacios.length());
    }

    //Metodo para buscar la primera ocurrencia del char que se pase como parámetro
    public static int buscarPrimeraOcurrencia(String frase, char caracter) {
        
        //Recorro la frase y busco el caracter
        for (int i = 0; i < frase.length(); i++) {
            
            if (frase.charAt(i) == caracter) {
                
                return i; //Si en la frase coincide algun caracter con el caracter que paso me devuelve la posicion
            }
        }
        return -1;//Devuelvo -1 para indicar en el main que no se ha encontrado el caracter
    }

    //Busco las posiciones de el caracter que me piden
    public static int[] buscarPosicionesCaracter(String frase, char caracter) {
        
        int[] posiciones = new int[0];
        
        for (int i = 0; i < frase.length(); i++) {
            
            if (frase.charAt(i) == caracter) {
                
                int[] temp = new int[posiciones.length + 1];
                
                for (int j = 0; j < posiciones.length; j++) {
                    
                    temp[j] = posiciones[j];
                    
                }
                
                temp[posiciones.length] = i;
                
                posiciones = temp;
            }
        }
        return posiciones;
    }

}
