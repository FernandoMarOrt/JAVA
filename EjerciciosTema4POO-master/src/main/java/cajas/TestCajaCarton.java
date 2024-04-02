package cajas;

public class TestCajaCarton {

    public static void main(String[] args) {
        //Declaro el objeto cajaGrande
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);

        //Declaro el objeto cajaChica
        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);

        //Muestro los datos utilizando los mnetodos get
        System.out.println(cajaGrande.getAncho());
        System.out.println(cajaGrande.getAlto());
        System.out.println(cajaGrande.getLargo());
        System.out.println(cajaGrande.getPeso());

        //Muestro los datos utilizando los mnetodos get
        System.out.println(cajaChica.getAncho());
        System.out.println(cajaChica.getAlto());
        System.out.println(cajaChica.getLargo());
        System.out.println(cajaChica.getPeso());

        System.out.println(cajaGrande.toString());
        System.out.println(cajaChica.toString());

    }

}
