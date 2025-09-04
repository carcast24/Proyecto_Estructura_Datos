import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciamos managers
        UsuariosManager usuariosManager = new UsuariosManager();
        LibrosManager librosManager = new LibrosManager();
        PrestamosManager prestamosManager = new PrestamosManager();
        Consultas consultas = new Consultas();

        int firstOption;

        // ===== BUCLE PRINCIPAL =====
        do {
            System.out.println("------ Bienvenidos ------\n");
            System.out.println("****** Menu Principal ******\n");
            System.out.println("1. Gestión de Usuarios.");
            System.out.println("2. Gestión de Préstamos.");
            System.out.println("3. Gestión de Inventarios.");
            System.out.println("4. Consultas.");
            System.out.println("5. Salir.\n");

            firstOption = -1; // valor inicial inválido

            // ===== VALIDACIÓN DE ENTRADA =====
            while (firstOption == -1) {
                System.out.print("Digita la opción: ");
                String entrada = sc.nextLine().trim();

                if (entrada.isEmpty()) {
                    System.out.println(" No puede estar vacío.\n");
                    continue;
                }

                try {
                    firstOption = Integer.parseInt(entrada);
                    if (firstOption < 1 || firstOption > 5) {
                        System.out.println(" Opción fuera de rango (1-5).\n");
                        firstOption = -1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingresa solo números.\n");
                }
            }
            switch (firstOption) {
                case 1:
                    usuariosManager.menuUsuarios(sc);
                    break;
                case 2 :
                    prestamosManager.menuPrestamos(sc, usuariosManager, librosManager);
                    break;
                case 3 :
                    librosManager.menuLibros(sc);
                    break;
                case 4 :
                    consultas.MenuConsultas(sc, librosManager, usuariosManager);
                     break;
                case 5 :
                    System.out.println("¡Hasta Luego! Vuelve Pronto");
                    break;
                default:
                    System.out.println("Opcion No Valida Intenta De Nuevo");
            }


        } while (firstOption != 5);
     sc.close();
    }
}