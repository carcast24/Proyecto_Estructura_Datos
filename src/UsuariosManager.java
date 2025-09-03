import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                return true; // hizo el cambio
            }
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
    public List<Usuarios> listar() {
        return usuarios;
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
    public void menuUsuarios(Scanner sc){
        System.out.println("----- Gestion de Usuarios -----\n");
        char secondOption;
        do {
            System.out.println("A. Registrar Ususario.");
            System.out.println("B. Eliminar Usuario.");
            System.out.println("C. Modificar Usuario.");
            System.out.println("D. Listar Usuarios.");
            System.out.println("S. Salir, Gestion de Usuarios. \n");
            System.out.println("Digite la Opcion aqui ↓: ");
            String input = sc.nextLine().trim().toUpperCase();// lee -- pasa a mayuscula -- toma el primer caracter
            secondOption = input.isEmpty()? ' ': input.charAt(0); 

            switch (secondOption){
                case 'A' :
                    System.out.println("----- Registro Para Nuevo Usuario. -----");
                    break;
                case 'B' :
                    System.out.println("----- Eliminar A Un Usuario. -----");
                    break;
                case 'C' :
                    System.out.println("----- Modificar A Un Usuario. -----");
                    break;
                case 'D' :
                    System.out.println("----- Expedir Lista De Usuarios. -----");
                    break;
                case 'S' :
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Opcion No Valida...");
            }
        }while (secondOption != 'S');
    }

}
