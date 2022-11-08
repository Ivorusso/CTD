package daos;

import java.util.List;

public interface IDao<T> {

    public T guardar(T t);

    public void eliminar(String t);

    public T buscar(String  t);

    public List<T> mostrarTodos();
}
