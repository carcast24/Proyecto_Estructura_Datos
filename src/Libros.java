public class Libros {
    private String title;
    private String author;
    private String isbn;
    private String genres;

    // constructor

    public Libros(String title, String author, String isbn, String genres){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genres = genres;
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
    //setter


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
}
