package module_4.practice.task_4;

public abstract class AbstractDAO {

    public Object save(Object object) {
        System.out.println(object.toString() + "saved");
        return object;
    }

    public Object update(Object object) {
        System.out.println(object.toString() + "update");
        return object;
    }

    public boolean delete(Object object) {
        System.out.println(object.toString() + "deleted");
        return true;
    }

    abstract public Object find(long id);
}
