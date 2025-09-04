import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrestamosManager implements Managers<Prestamo>{
    private LinkedList<Prestamo> prestamos = new LinkedList<>();

    @Override
    public void agregar(Prestamo p) {
        prestamos.add(p);
    }

    @Override
    public boolean eliminar(String id) {
        for (int i = 0; i< prestamos.size(); i++){
            if (prestamos.get(i).getId().equalsIgnoreCase(id)){
                prestamos.remove(i);
                return true;
            }
        }
        return false; // no encontrado
    }

    @Override
    public boolean modificar(String id, Prestamo nuevo) {
        for(int i = 0; i < prestamos.size(); i++){
            if(prestamos.get(i).getId().equalsIgnoreCase(id)){
                prestamos.set(i,nuevo);
                return true; // hizo el cambio
            }
        }
        return false; // no encontro el id
    }

    @Override
    public Prestamo buscar(String id) {
        for(Prestamo p : prestamos){
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Prestamo> listar() {
        return prestamos;
    }
    // ---------- metodos auxiliares --------------
    public void registrarPrestamo(Scanner sc, UsuariosManager usuariosManager, LibrosManager librosManager) {
        System.out.println("----- Registrar Préstamo -----");

        // Buscar usuario
        System.out.print("ID usuario: ");
        String idUsuario = sc.nextLine();
        Usuarios u = usuariosManager.buscar(idUsuario);

        if (u == null) {
            System.out.println(" Usuario no encontrado.");
            return;
        }

        // Buscar libro
        System.out.print("ISBN libro: ");
        String isbn = sc.nextLine();
        Libros l = librosManager.buscar(isbn);

        if (l == null) {
            System.out.println(" Libro no encontrado.");
            return;
        }

        if (!l.isDisponible()) {
            System.out.println("El libro ya está prestado.");
            return;
        }

        // Crear préstamo
        Prestamo p = new Prestamo(u, l);
        agregar(p);

        // Cambiar estado del libro a prestado
        l.setDisponible(false);

        System.out.println(" Préstamo registrado con id: " + p.getId());
    }
    //------------------------------------------------------------------------------
    public void registrarDevolucion(Scanner sc, LibrosManager librosManager) {
        System.out.println("----- Registrar Devolución -----");
        System.out.print("ID del préstamo: ");
        String idPrestamo = sc.nextLine();

        Prestamo p = buscar(idPrestamo);

        if (p == null) {
            System.out.println("" +
                    " Préstamo no encontrado.");
            return;
        }

        if (!p.isStatus()) {
            System.out.println("Ese préstamo ya fue devuelto.");
            return;
        }

        // Cambiar estado del préstamo
        p.returnLoan();

        // Marcar libro como disponible otra vez
        p.getLibro().setDisponible(true);

        System.out.println(" Devolución registrada con éxito.");
    }

    public void menuPrestamos(Scanner sc, UsuariosManager usuariosManager, LibrosManager librosManager){
                    System.out.println("----- Gestion de Prestamos -----\n");
                    char thirdOption;
                    do {
                        System.out.println("A. Registrar Prestamo.");
                        System.out.println("B. Registrar Devolucion.");
                        System.out.println("C. Listar Prestamos Activos.");
                        System.out.println("S. Salir, Gestion Prestamos. \n");
                        System.out.println("Digite la Opcion aqui ↓: ");
                        String input = sc.nextLine().trim().toUpperCase(); // lee -- pasa a mayuscula -- toma el primer caracter
                        thirdOption = input.isEmpty()? ' ' : input.charAt(0); // con ternario se valida si hay entrada vacia no se ejecuta el codigo

                        switch (thirdOption){
                            case 'A' :
                                System.out.println("----- Registra Un Prestamo. -----");
                                registrarPrestamo(sc, usuariosManager, librosManager);
                                break;
                            case 'B' :
                                System.out.println("----- Registra Una Devolucion. -----");
                                registrarDevolucion(sc, librosManager);
                                break;
                            case 'C' :
                                System.out.println("----- Expedir Lista De Prestamos Activos. -----");
                                for (Prestamo pr : listar()) {
                                    System.out.println(pr);
                                }
                                break;
                            case 'S' :
                                System.out.println("Hasta Luego...");
                                break;
                            default:
                                System.out.println("Opcion No Valida...");
                        }
                    }while (thirdOption != 'S');
    }
}
