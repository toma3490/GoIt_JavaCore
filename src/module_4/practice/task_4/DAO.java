package module_4.practice.task_4;

public interface DAO {
    Object save(Object object);
    Object update(Object object);
    boolean delete(Object object);
    Object find(long id);
}
