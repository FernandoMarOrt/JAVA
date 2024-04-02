/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generico;

/**
 *
 * @author Usuario
 */
public class CatalogoAlquileres extends CatalogoGenerico<Alquiler> {

    public CatalogoAlquileres(int tamanio) {
        
        super(tamanio);
    }

    public Alquiler buscarAlquiler(int alquilerID) {
        
        Alquiler aux = new Alquiler();
        
        aux.setAlquilerID(alquilerID); 
        
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
        
    }

    
    
    //METODO DEL EJERCICIO 5C PARA SABER SI EL CLIENTE TIENE ALGUN ALQUILER
    public boolean ClienteTieneAlquiler(String nif) {

        boolean clienteTieneAlquiler = false;

        for (int i = 0; i < lista.size(); i++) {

            //busco en la lista si el nif que le he pasado coincide con alguno
            //de los que hay en alquileres si es asi asigno al booleano true 
            //para que me indice que si hay un alquiler asociado al cliente pasado
            if (lista.get(i).getClientes().getNif().equals(nif)) {

                clienteTieneAlquiler = true;

            }
        }

        return clienteTieneAlquiler;
    }

     //METODO DEL EJERCICIO 5C PARA SABER SI EL VEHICULO TIENE ALGUN ALQUILER
    public boolean VehiculoTieneAlquiler(String bastidor) {

        boolean vehiculoTieneAlquiler = false;
        
        for (int i = 0; i < lista.size(); i++) {

            //busco en la lista si el bastidor que le he pasado coincide con alguno
            //de los que hay en alquileres si es asi asigno al booleano true 
            //para que me indice que si hay un alquiler asociado al vehiculo pasado
            if (lista.get(i).getVehiculo().getBastidor().equals(bastidor)) {
                vehiculoTieneAlquiler = true;

            }
        }
        
        return vehiculoTieneAlquiler;

    }

}
