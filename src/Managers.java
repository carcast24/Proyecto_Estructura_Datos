public interface Managers<T> {
    // crear un nuevo registro
    void agregar(T obj);

    //eliminar registro
    boolean eliminar(String id);

    // modificar un registro
    boolean modificar(String id, T nuevo);

    // buscar un registro
    T buscar (String id);

    // listar

    java.util.List<T> listar();


}
