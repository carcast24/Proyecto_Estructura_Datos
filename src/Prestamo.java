import java.time.LocalDate;
public class Prestamo {
    private Usuarios usuarios;
    private Libros libro;
    private LocalDate LoanDate;
    private boolean active;

    // constructor
    public Prestamo(Usuarios usuarios, Libros libro){
        this.usuarios = usuarios;
        this.libro = libro;
        this.LoanDate = LocalDate.now(); // llama la fecha en formato local de la ejecucion
        this.active = true; // por defecto esta activo el prestamo al registrarlo
    }

    // class method

}
