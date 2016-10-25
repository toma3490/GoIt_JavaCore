package module_8.homework;

import java.util.Iterator;
import java.util.List;

public class DAOImpl <T> implements AbstractDAO<T>{

    private List<T> list;

    @Override
    public T save(T item) {
        list.add(item);
        return item;
    }

    @Override
    public void delete(T item) {
        list.remove(item);
    }

    @Override
    public void deleteAll(List<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            list.remove(iterator.next());
        }
    }

    @Override
    public void saveAll(List<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }
    }

    @Override
    public List<T> getList() {
        return list;
    }
}
