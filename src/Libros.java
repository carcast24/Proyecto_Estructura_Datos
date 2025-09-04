public class Libros {
    private String title;
    private String author;
    private String isbn;
    private String genres;
    private boolean disponible;


    // constructor

    public Libros(String title, String author, String isbn, String genres){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genres = genres;
        this.disponible = true; // por defecto, los libros nuevos están disponibles
    }
    // getter
    public String getTitle(){
        return this.title;
    }

    public String getAuthor() {
        return author;
    }
    public String getIsbn(){
        return this.isbn;

    }
    public String getGenres() {
        return genres;
    }
    public boolean isDisponible() {
        return disponible;
    }


    //setter
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    // toString

    public String toString(){
        return "----- Informacion De Libros -----" + "\n" +
                "--------------------------------"+ "\n" +
                "Titulo: " + title + "\n" +
                "Autor: " + author + "\n" +
                "ISBN: " + isbn + "\n" +
                "Genero: " + genres + "\n" +
                "Estado: " + (disponible ? "Disponible" : "Prestado") +
                "---------------------------------";
    }
}
