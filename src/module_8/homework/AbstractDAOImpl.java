package module_8.homework;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T extends BaseEntity> implements AbstractDAO<T>{

    private List<T> listDAO = new ArrayList<>();

    @Override
    public T save(T item) {
        listDAO.add(item);
        return item;
    }

    @Override
    public void delete(T item) {
        listDAO.remove(item);
    }

    @Override
    public void deleteAll(List<T> list) {
        listDAO.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        listDAO.addAll(list);
        System.out.println("Data was saved");
    }

    @Override
    public List<T> getList() {
        return listDAO;
    }

    @Override
    public T getById(long id) {
        for (T item : listDAO) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void deleteById(long id) {
        for (T item : listDAO) {
            if (item.getId() == id) {
                listDAO.remove(item);
            }
        }
    }
}
