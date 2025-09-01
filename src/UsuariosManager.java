import java.util.ArrayList;

public class UsuariosManager {
    private ArrayList<Usuarios> usuarios = new ArrayList<>();

    //add
    public void registroUsuario(Usuarios u){
        usuarios.add(u);
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



}
