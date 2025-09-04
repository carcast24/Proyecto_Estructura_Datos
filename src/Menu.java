import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int firstOption;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------ Bienvenidos ------\n");
            System.out.println("****** Menu Principal ******\n");
            System.out.println("1. Gestion de Usuarios.");
            System.out.println("2. Gestion de Prestamos.");
            System.out.println("3. Gestion de Inventarios.");
            System.out.println("4. Consultas.");
            System.out.println("5. Salir.\n");

            System.out.println("Digita la opcion: ");
            firstOption = sc.nextInt();

            switch (firstOption) {
                case 1:


                case 2 :
                    
                    break;
                case 3 :

                    break;
                case 4 :

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