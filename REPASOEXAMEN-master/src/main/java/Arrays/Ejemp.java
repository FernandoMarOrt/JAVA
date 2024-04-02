package Arrays;

/**
 *
 * @author alvaro
 */
public class Ejemp {
    
    public static void main(String[] args) {
        
        //INICIALIZACION CON VALORES
        //numeros[1] = 2
        int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};
        
        System.out.println("Mostrar elemento del indice 5: " + numeros[5]);
        
        //PUEDO RECORRER CUALQUIER ELEMENTI DENTRO DEL RANGO 0 Y 11
        
        //System.out.println("Mostrar elemento del indice -5: " + numeros[-1]); ArrayIndexOutOfBoundsException
        
        //TAMAÑO DEL ARRAY
        System.out.println(numeros.length); //INDICE = LEGTH - 1
        
        
        //IMPRIMIR TODOS LOS ELEMENTOS DEL ARRAY
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "-");
        }
        
        System.out.println("\nCon for each: ");
        //EL ARRAY ES DE INT, POR LO QUE SE CREA UN INT AUX QUE ES EL Q VA A RECORRER EL ARRAY 
        for (int aux : numeros) {
            System.out.print(" - " + aux);
        }
        
        
        numeros[5] = 90;    //CAMBIA VALOR QUE OCUPABA LA POSICION 5
        
        
    }
}
