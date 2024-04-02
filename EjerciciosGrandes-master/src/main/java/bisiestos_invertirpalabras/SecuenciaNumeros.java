package bisiestos_invertirpalabras;

public class SecuenciaNumeros {

    public static void main(String[] args) {

        //Realiza un programa que imprima por consola los 35 primeros
        //terminos de la siguiente serie;
        int F0 = 0;
        int F1 = 1;

        int FN = 1;
        System.out.print(F0 + " - " + F1 + " - ");
        for (int i = 0; i < 35; i++) {

            FN = F0 + F1;
            F0 = F1;
            F1 = FN;
            System.out.print(FN + " - ");

        }

    }

}
