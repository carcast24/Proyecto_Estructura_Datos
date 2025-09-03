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
                    System.out.println("----- Gestion de Prestamos -----\n");
                    char thirdOption;
                    do {
                        System.out.println("A. Registrar Prestamo.");
                        System.out.println("B. Registrar Devolucion.");
                        System.out.println("C. Listar Prestamos Activos.");
                        System.out.println("S. Salir, Gestion Prestamos. \n");
                        System.out.println("Digite la Opcion aqui ↓: ");
                        thirdOption = sc.next().toUpperCase().charAt(0); // lee -- pasa a mayuscula -- toma el primer caracter

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
                    break;
                case 3 :
                    System.out.println("----- Gestion de Inventarios. -----\n");
                    char fourthOption;

                    do {
                        System.out.println("A. Agregar Nuevo Libro.");
                        System.out.println("B. Eliminar Libro.");
                        System.out.println("C. Modificar Datos De Un Libro.");
                        System.out.println("D. Inventario.");
                        System.out.println("S. Salir.\n");
                        System.out.println("Digite la Opcion aqui ↓: ");
                        fourthOption = sc.next().toUpperCase().charAt(0);

                        switch (fourthOption){
                            case 'A' :
                                System.out.println("----- Agregar Libro -----");
                                break;
                            case 'B' :
                                System.out.println("----- Eliminar Libro -----");
                                break;
                            case 'C' :
                                System.out.println("----- Modifica Un Libro -----");
                                break;
                            case 'D' :
                                System.out.println("----- Expide Un Inventario -----");
                                break;
                            case 'S':
                                System.out.println("¿Terminaste? bye!....");
                                break;
                            default:
                                System.out.println("Nanai Opcion Incorrecta...");
                        }
                    }while (fourthOption != 'S');
                    break;
                case 4 :
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
                         fifthOption = sc.next().toUpperCase().charAt(0);

                         switch (fifthOption){
                             case 'A' :
                                 System.out.println("----- Buscar El Titulo Deseado -----");
                                 break;
                             case 'B' :
                                 System.out.println("----- Buscar El Autor Deseado -----");
                                 break;
                             case 'C' :
                                 System.out.println("----- Buscar Por El ISBN -----");
                                 break;
                             case 'D' :
                                 System.out.println("----- Buscar Por Cedula Del Usuario -----");
                                 break;
                             case 'E' :
                                 System.out.println("----- Buscar Por Nombre Del Usuario -----");
                                 break;
                             case 'S' :
                                 System.out.println("¿Busqueda Completa? Chao pues...");
                                 break;
                             default:
                                 System.out.println("jeje Sigue Intentando.. Opcion Invalida..");
                         }
                     }while (fifthOption != 'S');
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