/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generico;

/**
 *
 * @author fer
 */
public class CatalogoClientes extends CatalogoGenerico<Clientes> {

    public CatalogoClientes(int tamanio) {
        super(tamanio);
    }
    
    public Clientes buscarCliente(String nif) {

        Clientes aux = new Clientes();
        aux.setNif(nif);
        int posicion = buscarElemento(aux);
        
        return (posicion >= 0) ? this.lista.get(posicion) : null; //Si la posicion es menor que 0 devolvera false

    }
    
    
}
