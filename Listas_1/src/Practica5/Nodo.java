
package Practica5;

public class Nodo {
    private Nodo anterior;
    private Cancion dato;
    private Nodo siguiente;
    
    public Nodo (Cancion dato, Nodo siguiente, Nodo anterior){
     this.anterior = null;
     this.dato = dato;
     this.siguiente = null;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Cancion getDato() {
        return dato;
    }

    public void setDato(Cancion dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "anterior=" + anterior + ", dato=" + dato + ", siguiente=" + siguiente + '}';
    }
    
}
