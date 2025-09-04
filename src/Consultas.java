import java.util.Scanner;

public class Consultas {
    public void MenuConsultas(Scanner sc, LibrosManager librosManager, UsuariosManager usuariosManager){
        System.out.println("----- Consultas -----\n");
        char fifthOption;
        do {
            System.out.println("A. Buscar Por Titulo.");
            System.out.println("B. Buscar Por Autor.");
            System.out.println("C. Buscar Por ISBN");
            System.out.println("D. Buscar Usuario Por CC.");
            System.out.println("E. Buscar Usuario Por Nombre.");
            System.out.println("S. Salir.\n");

            System.out.println("Digite la Opcion aqui ↓: ");
            String input = sc.nextLine().trim().toUpperCase();// recibe el string completo, elimina los espacion inicio y final y pasa a mayuscula
            fifthOption = input.isEmpty()? ' ' : input.charAt(0);// el ternario se encarga de validar de que no este  vacia la entrada

            switch (fifthOption){
                case 'A' :
                    System.out.println("----- Buscar El Titulo Deseado -----");
                    buscarPorTitulo(sc,librosManager);
                    break;
                case 'B' :
                    System.out.println("----- Buscar El Autor Deseado -----");
                    buscarPorAutor(sc, librosManager);
                    break;
                case 'C' :
                    System.out.println("----- Buscar Por El ISBN -----");
                    buscarPorIsbn(sc, librosManager);
                    break;
                case 'D' :
                    System.out.println("----- Buscar Por Cedula Del Usuario -----");
                    buscarUsuarioPorId(sc, usuariosManager);
                    break;
                case 'E' :
                    System.out.println("----- Buscar Por Nombre Del Usuario -----");
                    buscarUsuarioPorNombre(sc, usuariosManager);
                    break;
                case 'S' :
                    System.out.println("¿Busqueda Completa? Chao pues...");
                    break;
                default:
                    System.out.println("jeje Sigue Intentando.. Opcion Invalida..");
            }
        }while (fifthOption != 'S');
    }
    //----------------------------metodos auxiliares para busqueda ---------------------------------------
    private void buscarPorTitulo(Scanner sc, LibrosManager librosManager) {
        System.out.print("Ingrese el título a buscar: ");
        String titulo = sc.nextLine();
        boolean encontrado = false;
        for (Libros l : librosManager.listar()) {
            if (l.getTitle().equalsIgnoreCase(titulo)) {
                System.out.println(" Libro encontrado: " + l);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println(" No se encontró un libro con ese título.");
        }
    }

    private void buscarPorAutor(Scanner sc, LibrosManager librosManager) {
        System.out.print("Ingrese el autor a buscar: ");
        String autor = sc.nextLine();
        boolean encontrado = false;
        for (Libros l : librosManager.listar()) {
            if (l.getAuthor().equalsIgnoreCase(autor)) {
                System.out.println(" Libro encontrado: " + l);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println(" No se encontró ningún libro de ese autor.");
        }
    }

    private void buscarPorIsbn(Scanner sc, LibrosManager librosManager) {
        System.out.print("Ingrese el ISBN a buscar: ");
        String isbn = sc.nextLine();
        Libros l = librosManager.buscar(isbn);
        if (l != null) {
            System.out.println(" Libro encontrado: " + l);
        } else {
            System.out.println(" No se encontró un libro con ese ISBN.");
        }
    }
    // ------------------- metodos auxiliares para busqueda --------------------------
    private void buscarUsuarioPorId(Scanner sc, UsuariosManager usuariosManager) {
        System.out.print("Ingrese la cédula (ID) del usuario: ");
        String id = sc.nextLine();
        Usuarios u = usuariosManager.buscar(id);
        if (u != null) {
            System.out.println(" Usuario encontrado: " + u);
        } else {
            System.out.println(" No se encontró usuario con esa cédula.");
        }
    }

    private void buscarUsuarioPorNombre(Scanner sc, UsuariosManager usuariosManager) {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = sc.nextLine();
        boolean encontrado = false;
        for (Usuarios u : usuariosManager.listar()) {
            if (u.getName().equalsIgnoreCase(nombre)) {
                System.out.println(" Usuario encontrado: " + u);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println(" No se encontró usuario con ese nombre.");
        }
    }
}
