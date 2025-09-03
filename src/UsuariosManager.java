import java.util.ArrayList;
import java.util.List;

public class UsuariosManager implements Managers<Usuarios> {
    private ArrayList<Usuarios> usuarios = new ArrayList<>();


    @Override
    public void agregar(Usuarios u) {
        usuarios.add(u);
    }

    @Override
    public boolean eliminar(String id) {
        return eliminarUsuario(id);
    }

    @Override
    public boolean modificar(String id, Usuarios nuevo) {
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getId().equalsIgnoreCase(id)){
                usuarios.set(i,nuevo);
            }
            return true; // hizo el cambio
        }
        return false; // no encontro el id
    }

    @Override
    public Usuarios buscar(String id) {
        for (Usuarios buscar : usuarios){
            if (buscar.getId().equalsIgnoreCase(id)){
                return buscar;
            }
        }
        return null;
    }

    @Override
    public List listar() {
        return List.of();
    }
    public boolean eliminarUsuario(String id){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getId().equalsIgnoreCase(id)){ // ignora la forma en la que se escribe
                usuarios.remove(i);
                return true;
            }

        }
        return false;
    }
    // implimentar mi propio set

}
