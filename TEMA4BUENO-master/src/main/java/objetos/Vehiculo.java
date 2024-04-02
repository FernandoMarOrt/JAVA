/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;
/*
¿Qué es un programa orientado a objetos?

es un modelo de programación informática que organiza el diseño de software en
torno a datos u objetos, en lugar de funciones y lógica. Un objeto se puede
definir como un campo de datos que tiene atributos y comportamiento únicos.

¿Qué es una clase?
Una clase es un molde donde vamos a indicar los atributos y metodos de los objetos
que queremos modelar

¿Qué es un objeto?
Es una variable de tipo referencia que contiene los datos concretos de una instancia de una clase

¿Cuáles son los pilares de la POO? Explica brevemente cada uno de ellos.
-Encapsulamiento 
-Herencia La herencia permite crear nuevas clases a partir de otras ya creadas
-Polimorfismo Que puede adoptar muchas formas
-Abstraccion Consiste en captar la características esenciales de un objeto, así como su comportamiento

¿Qué ventajas aporta la POO?
-Facilita la reutilizacion del software a traves de la herencia, la encapsulacion
y el polimorfimos que son las herramientas mas potentes del paradigma de la POO

-Facilita la construccion de programas portables

-Facilita el mantenimiento

-Provoca que las tareas de anilisis diseño e implementacion sean mas 
ya que se manejan objetos

¿Cuáles son las partes de una clase?
-Definicion 
-Atributos
-Metodos

¿Qué elementos componen la definición de una clase? Explica brevemente cada uno
-Objetos Elementos tangibles o intangibles del sistema es decir los sustantivos
-Atributos Las caracteristicas de los objetos
-Metodos Acciones que deben realizar

¿Qué es un método constructor?
sirven para “crear”  objetos de una clase en especifico


¿Qué son los métodos de consulta o getters?
Son metodos para  recibir datos


¿Qué son los métodos modificadores o setters?
Son metodos para enviar datos

¿En qué consiste la instanciación de un objeto?
Crea un espacio de memoria donde este almacene el estado de su objeto

¿Para qué sirve el operador ‘new’?
crear una instancia de un tipo de objeto definido por el usuario

¿Cuál es la función del método main()?
omo punto de partida para la ejecución del programa. Normalmente, controla la
ejecución del programa dirigiendo las llamadas a otras funciones del programa.

¿Cómo se declara el método main()?
public static void main(String[] args) {
}

¿Cómo interaccionan los objetos de una aplicación?



*/
//Definicion de la clase Vehiculo
public class Vehiculo {
    
    //ATRIBUTOS
    private String matricula;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;//Precio alquiler al dia (ya que va a ser como un rent a car)
    private boolean disponible; //Indicamos si esta disponible o ocupado
    
//    //CONSTRUCTORES
//    public Vehiculo(String matr, String bas, String mar,
//            String model, String col, double tar, boolean disp) {
//        
//        
//        //Matricula de este objeto es igual a matricula del parametro(variable)
//        
//        //Esto esta bien diferentes colores
//        this.matricula = matr;
//        this.bastidor = bas;
//        this.marca = mar;
//        this.modelo = model;
//        this.color = col;
//        this.tarifa = tar;
//        this.disponible = disp;
//        
//        //ESTO ESTA MAL (ROSA CON ROSA KK NO SE TOCA ES FRANCES)
//        this.matricula = matricula;
//        
//        
//    }
//    
    
    
//    public Vehiculo(){
//        //ESTO ES NECESARIO SI O SI CUANDO CREEMOS UN CONSTRUCTOR :)
//    }
//    
//    //SEGUNDO CONTRUSCTOR
//    public Vehiculo(String matricula, String color , String bastidor) {
//        
//        this.matricula = matricula;
//        this.color = color;
//        this.bastidor = bastidor;
//        
//        //el resto se quedan con valores por defecto:
//        //null para objetos
//        //0 para numeros 
//    }
//    
//    //METODOS GET EXTRAE INFORMACION DE UN ATRIBUTO
//    
//    public String getMatricula() {
//        
//        return this.matricula;//Devuelve el valor de la matricula
//    }
//    
//    //METODOS SET NO DEVUELVE NADA
//    
//    public void setMatricula(String matricula) {
//        
//        //Matricula del objeto ponte igual que la matricula q te estoy pasando
//        this.matricula = matricula;
//    }

    //CLICK DERECHO INSERTER CODE Y ALE
    public Vehiculo(String matricula, String bastidor, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    
    public Vehiculo() {
    }
    

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", bastidor=" + bastidor + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

   
    
    
    
}
