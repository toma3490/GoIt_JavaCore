package module_7.homework.hw_mod_5_update;

import java.util.List;

public interface DAO {
    List<Room> save(List<Room> room);
    boolean delete(List<Room> room);
    List<Room> update(List<Room> room);
    List<Room> findById(long id);
}
