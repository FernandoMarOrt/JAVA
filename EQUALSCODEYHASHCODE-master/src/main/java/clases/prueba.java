package clases;

public class prueba {

    public static void main(String[] args) {

        Serie s1 = new Serie("Los simpsos", "Comedia", "sinpsis", 10000000, "Pepe", 100);
        Persona persona2 = new Persona();
        
        Persona persona1 = ServicioPersona.datosPersona();
        System.out.println(persona1);

        System.out.println(s1); //Veo que la serie aun no le he dado like
        persona1.darLike(s1); //Persona 1 le da like a la serie
        System.out.println(s1); //Compruebo que persona 1 le ha dado like a la serie
    }

}
