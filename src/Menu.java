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
                    System.out.println("----- Gestion de Usuarios -----");
                    char secondOption;
                    do {
                        System.out.println("A. Registrar Ususario.");
                        System.out.println("B. Eliminar Usuario.");
                        System.out.println("C. Modificar Usuario.");
                        System.out.println("D. Listar Usuarios.");
                        System.out.println("S. Salir, Gestion de Usuarios. \n");
                        System.out.println("Digite la Opcion aqui ↓: ");
                        secondOption = sc.next().toUpperCase().charAt(0); // lee -- pasa a mayuscula -- toma el primer caracter

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

                case 2 :
                    System.out.println("----- Gestion de Usuarios -----");
                    char thirdOption;
                    do {
                        System.out.println("A. Registrar Ususario.");
                        System.out.println("B. Eliminar Usuario.");
                        System.out.println("C. Modificar Usuario.");
                        System.out.println("D. Listar Usuarios.");
                        System.out.println("S. Salir, Gestion de Usuarios. \n");
                        System.out.println("Digite la Opcion aqui ↓: ");
                        thirdOption = sc.next().toUpperCase().charAt(0); // lee -- pasa a mayuscula -- toma el primer caracter

                        switch (thirdOption){
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
                    }while (thirdOption != 'S');

            }


        } while (firstOption != 5);

    }
}