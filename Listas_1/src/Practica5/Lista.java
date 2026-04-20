
package Practica5;
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    int contador;
    
    public Lista (){
        this.inicio = null;
        this.fin = null;
        this.contador = 0;
    }
     public void insertarIncio(Cancion dato){
         if(isVacia()){
             inicio = fin = new Nodo(dato,null,null);
         }else {
             Nodo nuevo = new Nodo(dato,inicio,null);
             inicio.setAnterior(nuevo);
             inicio = nuevo;
         }
         contador ++;
     }
     public void insertarFinal(Cancion dato){
         if(isVacia()){
             inicio = fin = new Nodo(dato,null,null);
         }else {
             Nodo nuevo = new Nodo(dato,null,fin);
             fin.setSiguiente(nuevo);
             fin = nuevo;
         }
         contador ++;
     }
     public void eliminarInicio(){
         if(isVacia()){
             if(inicio==fin){
                 inicio = fin = null;
             } else {
                 inicio = inicio.getSiguiente();
                 inicio.setAnterior(null);
             }
         }
         contador --;
     }
     public void BuscarCancionIndice(){
    
}
     public boolean isVacia (){
         return inicio==null && fin==null;
     }
     public int CuentaNodos(){
         return contador;
     }
     public String imprimirLista(){
         String salida = "";
         if (!isVacia()){
             Nodo aux = inicio;
             while (aux!=null){
                 salida+=aux.getDato()+" ";
                 aux = aux.getSiguiente();
             }
            
         }
         return salida;
     }
}
     
     

