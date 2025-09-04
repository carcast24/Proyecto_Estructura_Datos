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
    // ----------- metodos de ayuda -----------------------
    private void agregarLibro(Scanner sc) {
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        agregar(new Libros(titulo, autor, isbn, genero));
        System.out.println(" Libro agregado.\n");
    }
    //---------------------------------------------------------
    private void eliminarLibro(Scanner sc) {
        System.out.print("ISBN del libro a eliminar: ");
        String isbn = sc.nextLine();
        if (eliminar(isbn)) {
            System.out.println(" Libro eliminado.\n");
        } else {
            System.out.println(" Libro no encontrado.\n");
        }
    }
    //------------------------------------------------------------
    private void modificarLibro(Scanner sc) {
        System.out.print("ISBN del libro a modificar: ");
        String isbn = sc.nextLine();
        Libros existente = buscar(isbn);
        if (existente == null) {
            System.out.println(" Libro no encontrado.\n");
            return;
        }
        System.out.print("Nuevo título: ");
        String titulo = sc.nextLine();
        System.out.print("Nuevo autor: ");
        String autor = sc.nextLine();
        System.out.print("Nuevo género: ");
        String genero = sc.nextLine();
        modificar(isbn, new Libros(titulo, autor, isbn, genero));
        System.out.println(" Libro modificado.\n");
    }
    //------------------------------------------------------------------
    private void listarLibros() {
        System.out.println("----- Inventario -----");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.\n");
        } else {
            for (Libros l : listar()) {
                System.out.println(l);
            }
        }
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
                    agregarLibro(sc); // llamo el metodo auxiliar para lijerar el codigo en este fragmento
                    break;
                case 'B' :
                    System.out.println("----- Eliminar Libro -----");
                    eliminarLibro(sc);
                    break;
                case 'C' :
                    System.out.println("----- Modifica Un Libro -----");
                    modificarLibro(sc);
                    break;
                case 'D' :
                    System.out.println("----- Expide Un Inventario -----");
                    listarLibros();
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
