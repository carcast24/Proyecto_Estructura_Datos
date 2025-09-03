import java.util.LinkedList;
import java.util.List;

public class PrestamosManager implements Managers<Prestamo>{
    private LinkedList<Prestamo> prestamos = new LinkedList<>();

    @Override
    public void agregar(Prestamo p) {
        prestamos.add(p);
    }

    @Override
    public boolean eliminar(String usuarioId, String isbn) {
        for (Prestamo p : prestamos){
            if (p.getUsuarios().getId().equalsIgnoreCase(usuarioId) && p.getLibro().getIsbn().equalsIgnoreCase(isbn)){
                prestamos.remove(p);
                return true; //eliminado correctamente
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
    public Prestamo buscar(String id) {
        return null;
    }

    @Override
    public List<Prestamo> listar() {
        return List.of();
    }
}
