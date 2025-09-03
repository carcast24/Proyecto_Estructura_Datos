import java.time.LocalDate;
public class Prestamo {
    private static int cont = 1; // para generar un ide unico por prestamo
    private String id;
    private Usuarios usuarios;
    private Libros libro;
    private LocalDate LoanDate;
    private boolean status;

    // constructor
    public Prestamo(Usuarios usuarios, Libros libro){
        this.id = "PRE-" + cont++;
        this.usuarios = usuarios;
        this.libro = libro;
        this.LoanDate = LocalDate.now(); // llama la fecha en formato local de la ejecucion
        this.status = true; // por defecto esta activo el prestamo al registrarlo
    }

    // class method
    public void returnLoan(){
        this.status = false;
    } // pone el prestamo en desactivado

    // getter


    public String getId() {
        return id;
    }

    public Usuarios getUsuarios(){
        return this.usuarios;
    }
    public Libros getLibro(){
        return this.libro;
    }

    public LocalDate getLoanDate() {
        return LoanDate;
    }
    public boolean isStatus() {
        return status;
    }
    // setters


    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }
    public void setLoanDate(LocalDate loanDate) {
        LoanDate = loanDate;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }





    public String toString(){
        return "----- Informacion De Prestamo -----" + "\n" +
                "--------------------------------"+ "\n" +
                "El usuario " + usuarios.getName() + "\n" +
                "Tiene el libro " + "\n" +
                                 libro.toString() + "\n" +
                "Prestado el  " + LoanDate + "\n" +
                "El prestamo se encuentra en estado: " + status + "\n" +
                "---------------------------------";
    }

}
