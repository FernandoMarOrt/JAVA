package ejercicioclase;

public class Prueba {
    public static void main(String[] args) {
        
        //CREAMOS UN PAR DE OBJETOS Y PROBAMOS LOS METODOS DE CALCULO CUENTA
        
        Cuenta cuenta1 = new Cuenta("76465645Z", "Juan", 15000, 0);
        Cuenta cuenta2 = new Cuenta("21035645Y", "Pepe", 18000, 1.5);
        Cuenta cuenta3 = new Cuenta("86345607X", "Diego", 3, 0.7);
        
        //PRUEBO CON EL OBJETO CUENTA Nº 1
        System.out.println("CUENTA Nº º1\n");
        
        System.out.println("Ingresar dinero:\n");
        CalculosCuenta.ingresarDinero(cuenta1, 1000);
        
        System.out.println("Ingresar intereses:\n");
        CalculosCuenta.ingresarInteres(cuenta1);
        
        System.out.println("Retirar dinero:\n");
        CalculosCuenta.retirarDinero(cuenta1, 300.0);
        
        
        
        //PRUEBO CON EL OBJETO CUENTA Nº 2
        System.out.println("CUENTA Nº º2\n");
        
        System.out.println("Ingresar dinero:\n");
        CalculosCuenta.ingresarDinero(cuenta2, 2000);
        
        System.out.println("Ingresar intereses\n:");
        CalculosCuenta.ingresarInteres(cuenta2);
        
        System.out.println("Retirar dinero:\n");
        CalculosCuenta.retirarDinero(cuenta2, 300.0);
        
        
        
        //PRUEBO CON EL OBJETO CUENTA Nº 3
        System.out.println("CUENTA Nº º3\n");
        
        System.out.println("Ingresar dinero:\n");
        CalculosCuenta.ingresarDinero(cuenta3, 3000);
        
        System.out.println("Ingresar intereses:\n");
        CalculosCuenta.ingresarInteres(cuenta3);
        
        System.out.println("Retirar dinero:\n");
        CalculosCuenta.retirarDinero(cuenta3, 300.0);
        
    }
}