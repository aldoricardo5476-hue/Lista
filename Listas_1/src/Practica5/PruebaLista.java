
package Practica5;
import java.util.LinkedList;
import java.util.Scanner;
public class PruebaLista {

    public static void main(String[] args) {
        Lista ld = new Lista();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int ag;
        int el;
        
        do{
            System.out.println("menu");
            System.out.println("1. Insertar al Frente ");
            System.out.println("2. Insertar al ultimo ");
            System.out.println("3. Insertar indice");
            System.out.println("4. Eliminar Frente");
            System.out.println("5. Eliminar Ultimo");
            System.out.println("6. Eliminar indice");
            System.out.println("7. Vaciar lista");
            System.out.println("8. Imprimir losta");
            System.out.println("9. Mostrar Frente");
            System.out.println("10. Mostrar Ultimo");
            System.out.println("11. Tamaño de lista");
            System.out.println("12.  Salir");
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
                        
                        ld.insertarIncio(c);
                        System.out.print("Cancion agregada con exito");
                        break;
                case 2: 
                        System.out.print("Titulo: ");
                        String titulo1 = sc.next();
                        
                        System.out.print("Interprete: ");
                        String interprete1 = sc.next();
                        
                        System.out.print("Duracion: ");
                        float duracion1 = sc.nextFloat();
                        
                        Cancion r = new Cancion(titulo1,interprete1,duracion1);
                        
                        ld.insertarFinal(r);
                        System.out.print("Cancion del frente eliminada");
                        break;
                case 3:
                        
                         break;
                case 4:
                        ld.eliminarInicio();
                        break;
                case 5:
                        
                        break;
                case 6:
                
                        break;
                case 7: 
                    
                        break;
                case 8: 
                        System.out.print("Lista: "+ld.imprimirLista());
                        //ld.imprimirLista();
                         break;
                case 9: 
                        
                         break;
                case 10: 
                        
                        break;
                case 11: 
                        //ld.CuentaNodos();
                        System.out.println("Numero de canciones: "+ld.CuentaNodos());
                        break;
                case 12: 
                       
                        break;
                case 13: 
                        
                        break;
                default:
                        System.out.println("Opcion no valida");
                        break;
      }                
            
            
        } while (opcion != 12);
        {
        
    }
        
    }
    
}
