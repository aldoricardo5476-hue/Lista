
package PT1;
import java.util.List;
import java.util.ArrayList;
        
public class Practica1 {
    
    public static void main(String[] args) {
      List<String> lista = new ArrayList<>();
      
      lista.add("Dedo");//1
      lista.add("Dado");
       
      System.out.println("Lista1: "+lista);
      
      lista.add(1, "Dar");//2
      lista.add(2, "Doctor");
      
      System.out.println("Lista2: "+lista);
      
      lista.addFirst("Dragon");//3
      lista.addFirst("Dictaminar");//4
      
      System.out.println("Lista2: "+lista);
      
      lista.addLast("Droga");//5
      lista.addLast("Degustar");//6
     
      System.out.println("Lista3: "+lista);
      
      lista.remove(0);
      
      System.out.println("Lista4: "+lista);
      
      lista.clear();
      
      if (lista.isEmpty()) {
      System.out.println("La lista está vacía.");
        } else {
        System.out.println("Contenido de la lista:");
      for (int i = 0; i < lista.size(); i++) {
        System.out.println(i + ": " + lista.get(i));
          }
       }
      
      }
    }
    

