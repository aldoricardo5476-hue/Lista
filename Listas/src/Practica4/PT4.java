
package Practica4;
import java.util.LinkedList;
public class PT4 {

    public static void main(String[] args) {
      LinkedList list = new LinkedList();
        
      list.add("Dado");
      list.add("Dedo");
       
      System.out.println("Lista1: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
              
      list.add(1, "Dar");//2
      list.add(2, "Doctor");
      
      System.out.println("Lista2: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
      
      list.addFirst("Dragon");//3
      list.addFirst("Dictaminar");//4
      
      System.out.println("Lista3: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
      
      list.addLast("Dictar");//5
      list.addLast("Degustar");//6
     
      System.out.println("Lista4: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
      
      list.remove(0);
      
      System.out.println("Eliminacion1: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
      
      list.remove("Dragon");
      
      System.out.println("Eliminacion2: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
      
      list.removeFirst();
      
      System.out.println("Eliminacion3: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");

      list.removeLast();
      
      System.out.println("Eliminacion4: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
      
      list.remove();
      
      System.out.println("Eliminacion5: "+list);
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
          System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }
      System.out.println("-------");
      
      list.clear();
      if (list.isEmpty()){
          System.out.println("Lista vacia");
      } else {
      System.out.println("Lista4: "+list);
      System.out.println("Frente: "+list.getFirst());
      System.out.println("Ultimo: "+list.getLast());

      }

      }
    }
    

