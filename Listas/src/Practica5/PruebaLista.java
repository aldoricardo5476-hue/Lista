
package Practica5;
import java.util.LinkedList;
import java.util.Scanner;
public class PruebaLista {

    public static void main(String[] args) {
        LinkedList<Cancion> list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int ag;
        int el;
        
        do{
            System.out.println("menu");
            System.out.println("1. Agregar cancion al ultimo");
            System.out.println("2. Eliminar cancion del Frente");
            System.out.println("3. Estado de la lista de reproduccion");
            System.out.println("4. Numero de canciones en total");
            System.out.println("5. Mostrar lista de reproduccion");
            System.out.println("6. Salir");
            System.out.println("7. Agregar cancion al frente");
            System.out.println("8. Agregar cancion por indice");
            System.out.println("9. Eliminar cancion del ultimo");
            System.out.println("10. Eliminar cancion por indice");
            System.out.println("11. Eliminar lista");
            System.out.println("12. Mostrar Cancion del Frente ");
            System.out.println("13. Mostrar Cancion del Ultimo ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                       System.out.print("Titulo: ");
                        String titulo = sc.next();
                        
                        System.out.print("Interprete: ");
                        String interprete = sc.next();
                        
                        System.out.print("Duracion: ");
                        float duracion = sc.nextFloat();
                        
                        Cancion c = new Cancion(titulo,interprete,duracion);
                        
                        list.addLast(c);
                        System.out.print("Cancion agregada con exito");
                        break;
                case 2: 
                        list.removeFirst();
                        System.out.print("Cancion del frente eliminada");
                        break;
                case 3:
                        if (list.isEmpty()){
                         System.out.println("Lista vacia");
                            } else {
                         System.out.println("Lista con canciones");
                        }
                         break;
                case 4:
                        System.out.println("Numero de canciones: " + list.size());
                        break;
                case 5:
                        System.out.println("Lista de reproduccion: " + list);
                        break;
                case 6:
                System.out.println("Saliendo...");
                        break;
                case 7: 
                    System.out.print("Titulo: ");
                        String titulo1 = sc.next();
                        
                        System.out.print("Interprete: ");
                        String interprete1 = sc.next();
                        
                        System.out.print("Duracion: ");
                        float duracion1 = sc.nextFloat();
                        
                        Cancion cc = new Cancion(titulo1,interprete1,duracion1);
                        
                        list.addFirst(cc);
                        System.out.print("Cancion agregada con exito");
                        break;
                     case 8: 
                    System.out.print("Titulo: ");
                        String titulo2 = sc.next();
                        
                        System.out.print("Interprete: ");
                        String interprete2 = sc.next();
                        
                        System.out.print("Duracion: ");
                        float duracion2 = sc.nextFloat();
                        
                        Cancion i = new Cancion(titulo2,interprete2,duracion2);
                        
                        System.out.println("Agregar cancion al indice: ");
                        ag = sc.nextInt();
                        
                        list.add(ag, i);
                        System.out.print("Cancion agregada con exito");
                         break;
                     case 9: 
                        list.removeLast();
                        System.out.print("Cancion del ultimo eliminada");
                        break;
                     case 10: 
                        System.out.println("Indice de cancion a eliminar: ");
                        el = sc.nextInt();
                        list.remove(el);
                        System.out.print("Cancion por indice eliminada");
                        break;
                        case 11: 
                        list.clear();
                        System.out.print("Lista eliminada");
                        break;
                        case 12: 
                        System.out.print("Cancion del Frente"+list.getFirst());
                        break;
                        case 13: 
                        System.out.print("Cancion del Ultimo"+list.getLast());
                        break;
                default:
                        System.out.println("Opcion no valida");
                        break;
      }                
            
            
        } while (opcion != 6);
        {
        
    }
        
    }
    
}
