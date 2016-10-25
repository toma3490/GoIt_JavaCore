package module_8.homework;

import java.util.List;

public interface AbstractDAO <T>{
    T save (T item);
    void delete(T item);
    void deleteAll(List<T> list);
    void saveAll(List<T> list);
    List<T> getListDAO();
    void deleteById(long id);
    T get(long id);

}
