package module_7.homework.hw_mod_5_update;

import java.util.List;

public class DAOImpl implements DAO {
    @Override
    public List<Room> save(List<Room> room) {
        System.out.println(room.toString() + " was saved");
        return room;
    }

    @Override
    public boolean delete(List<Room> room) {
        System.out.println(room.toString() + " was deleted");
        return false;
    }

    @Override
    public List<Room> update(List<Room> room) {
        System.out.println(room.toString() + "was updated");
        return room;
    }

    @Override
    public List<Room> findById(long id) {
//        Room room = new Room(0, 0, 0, 0, 0, null, null);
//        System.out.println(room.toString() + " found");
        return null;
    }
}
