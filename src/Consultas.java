import java.util.Scanner;

public class Consultas {
    public void MenuConsultas(Scanner sc){
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
            String input = sc.nextLine().trim().toUpperCase();// recibe el string completo, elimina los espacion inicio y final y pasa a mayuscula
            fifthOption = input.isEmpty()? ' ' : input.charAt(0);// el ternario se encarga de validar de que no este  vacia la entrada

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
    }
}
