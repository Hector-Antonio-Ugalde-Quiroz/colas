/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

/**
 *
 * @author Alumno
 */

class Nodo {
Object elemento;
Nodo siguiente;


public Nodo(Object x){
elemento = x;
siguiente = null;
}
}

public class ColaLista {
    protected Nodo frente;
    protected Nodo fin;
    
    public ColaLista(){
    frente = fin =null;
    }
    
    public void insertar(Object elemento){
    Nodo a;
    a = new Nodo(elemento);
        if (ColaVacia()) {
            frente= a;
            
        } else {
            fin.siguiente=a;
        }
        fin = a;
    }
    
    public Object quitar()throws Exception{
    Object aux;
        if (!ColaVacia()) {
            aux=frente.elemento;
            frente=frente.siguiente;
            
        } else {
            throw new Exception("Eliminar de unaa cola vacia");
        }
            return aux;
    }
    
    public void borrarCola(){
        for (; frente != null;) {
            frente=frente.siguiente;
        }
        System.gc();
    }
    
    
    public Object frenteCola() throws Exception{
        if (ColaVacia()) {
            throw new Exception("Error cola vacia");
        }
        return (frente.elemento);
    }

    private boolean ColaVacia() {
return (frente==null);
    }
}
