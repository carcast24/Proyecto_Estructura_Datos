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
    public boolean modificar(String isbn, Prestamo nuevo) {
        for(int i = 0; i < prestamos.size(); i++){
            if(prestamos.get(i).getLibro().getIsbn().equalsIgnoreCase(isbn)){
                prestamos.set(i,nuevo);
                return true; // hizo el cambio
            }
        }
        return false; // no encontro el id
    }

    @Override
    public Prestamo buscar(String isbn) {
        for(Prestamo p : prestamos){
            if (p.getLibro().getIsbn().equalsIgnoreCase(isbn)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Prestamo> listar() {
        return prestamos;
    }

    public void menuPrestamos(Scanner sc){
                    System.out.println("----- Gestion de Prestamos -----\n");
                    char thirdOption;
                    do {
                        System.out.println("A. Registrar Prestamo.");
                        System.out.println("B. Registrar Devolucion.");
                        System.out.println("C. Listar Prestamos Activos.");
                        System.out.println("S. Salir, Gestion Prestamos. \n");
                        System.out.println("Digite la Opcion aqui ↓: ");
                        String input =sc.nextLine().trim().toUpperCase(); // lee -- pasa a mayuscula -- toma el primer caracter
                        thirdOption = input.isEmpty()? ' ' : input.charAt(0); // con ternario se valida si hay entrada vacia no se ejecuta el codigo

                        switch (thirdOption){
                            case 'A' :
                                System.out.println("----- Registra Un Prestamo. -----");
                                break;
                            case 'B' :
                                System.out.println("----- Registra Una Devolucion. -----");
                                break;
                            case 'C' :
                                System.out.println("----- Expedir Lista De Prestamos Activos. -----");
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
