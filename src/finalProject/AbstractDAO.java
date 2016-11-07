package finalProject;

import java.util.List;

public interface AbstractDAO<T> {
    T save (T item);
    void saveAll(List<T> list);
    void delete(T item);
    void deleteAll(List<T> list);
    List<T> getList();
}
