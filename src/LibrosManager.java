import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrosManager implements Managers<Libros>{
    private ArrayList<Libros> libros = new ArrayList<>();

    @Override
    public void agregar(Libros l) {
        libros.add(l);
    }

    @Override
    public boolean eliminar(String isbn) {
        for (int i =0; i < libros.size(); i++){
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
             libros.remove(i);
             return true;
            }
        }
        return false;
    }

    @Override
    public boolean modificar(String isbn, Libros nuevo) {
        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
                libros.set(i,nuevo);
                return true;
            }
        }
        return false;
    }

    @Override
    public Libros buscar(String isbn) {
        for (Libros b : libros){
            if (b.getIsbn().equalsIgnoreCase(isbn)){
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Libros> listar() {
        return libros;
    }

    public void menuLibros(Scanner sc){
        System.out.println("----- Gestion de Inventarios. -----\n");
        char fourthOption;

        do {
            System.out.println("A. Agregar Nuevo Libro.");
            System.out.println("B. Eliminar Libro.");
            System.out.println("C. Modificar Datos De Un Libro.");
            System.out.println("D. Inventario.");
            System.out.println("S. Salir.\n");
            System.out.println("Digite la Opcion aqui ↓: ");
            String input =  sc.nextLine().trim().toUpperCase(); // recibe el string completo, elimina los espacion inicio y final y pasa a mayuscula
            fourthOption = input.isEmpty()? ' ' : input.charAt(0); // el ternario se encarga de validar de que no este  vacia la entrada

            switch (fourthOption){
                case 'A' :
                    System.out.println("----- Agregar Libro -----");
                    break;
                case 'B' :
                    System.out.println("----- Eliminar Libro -----");
                    break;
                case 'C' :
                    System.out.println("----- Modifica Un Libro -----");
                    break;
                case 'D' :
                    System.out.println("----- Expide Un Inventario -----");
                    break;
                case 'S':
                    System.out.println("¿Terminaste? bye!....");
                    break;
                default:
                    System.out.println("Nanai Opcion Incorrecta...");
            }
        }while (fourthOption != 'S');
    }
}
