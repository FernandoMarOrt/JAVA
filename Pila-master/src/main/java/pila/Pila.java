/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author fer
 */
public class Pila<T> {

    private List<T> nuevaPila;

    private int tamanio;

    public Pila(int tamanio) {

        this.nuevaPila = new ArrayList<>();
        this.tamanio = tamanio;
    }

    //B) Push de la pila (apilar elemento (en inglés push), lo inserta donde proceda)
    public void pilaPush(T Elemento) {

        this.nuevaPila.add(Elemento);

    }

    //C) Pop de la pila (desapilar (en inglés pop), que saca el elemento que toque.)
    public void pilaPop() {

        this.nuevaPila.remove(this.nuevaPila.size() - 1);

    }

    //D) Pila vacia (Saber si la pila está vacía.)
    public boolean pilaVacia() {

        return this.nuevaPila.isEmpty();

    }

    //E) Pila llena (Saber si la pila está llena.)
    public boolean pilaLlena() {

        if (this.nuevaPila.size() == this.tamanio) {

            return true;

        } else {

            return false;

        }

    }

    //F Pila Numero elementos(Saber el número de elementos que contiene la pila.)
    public int pilaNElmentos() {

        return this.nuevaPila.size();

    }

    //G) Mostrar por consola los elementos 
    public void pilaMostrarElementos() {

        for (int i = this.nuevaPila.size() - 1; i >= 0; i--) {

            System.out.println(this.nuevaPila.get(i));

        }

    }

    //H) Rellenar la pila  //SIN ACABAR
    public void rellenar(T[] array) {

        //Quitar primero todo lo de la pila
        this.nuevaPila.removeAll(nuevaPila);

        
        //Añadir lo del array
        
        for (int i = 0; i < array.length; i++) {

            this.nuevaPila.add(array[i]);

        }
    }

    //I) Sacar elementos de la pila y los devuelve en una rray de object
    public Object[] sacarElementos() { //ACABAR

        Object[] prueba = this.nuevaPila.toArray();
        
        this.nuevaPila.removeAll(nuevaPila);

        return prueba;
        
        
    }
    
  

    public List<T> getNuevaPila() {
        return nuevaPila;
    }

    public void setNuevaPila(List<T> nuevaPila) {
        this.nuevaPila = nuevaPila;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("nuevaPila=").append(nuevaPila);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nuevaPila);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pila<?> other = (Pila<?>) obj;
        return Objects.equals(this.nuevaPila, other.nuevaPila);
    }

}
