package pin_contraseñas_stringutils;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

public class Ejercicio4B {

    public static void main(String[] args) {

        String menu = """
                      1-Generar PIN de 4 digitos
                      2-Generar una contraseña con 8 caracteres
                      3-Genera una secuencia de n caracteres aleatorios
                      """;

        String menuString = JOptionPane.showInputDialog(menu);

        switch (menuString) {
            case "1":

                pin();

                break;
            case "2":

                contraseña1();

                break;
            case "3":
                
                contraseña2();

                break;
            default:

        }

    }

    public static void pin() {

        //PIN DE 4 DIGITIOS DE UN MOVIL
        for (int i = 0; i < 10; i++) {

            String pin = RandomStringUtils.randomNumeric(4);

            System.out.println(pin);

        }

    }

    public static void contraseña1() {

        //CONTRASEÑA DE 8 DIGITOS
        for (int i = 0; i < 10; i++) {

            String password = RandomStringUtils.randomAlphanumeric(8);

            System.out.println(password);

        }

    }

    public static void contraseña2() {
        

        //2º CONTRASEÑA DE 8 DIGITO
        char[] conjuntoCaracteres = {'a', 'b', 'z', 'q', 'p', '!', '"', '1'};

        int numero = 6;

        for (int i = 0; i < 10; i++) {

            String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);

            System.out.println(password2);

        }

    }

}
