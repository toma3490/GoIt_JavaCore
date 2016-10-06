package module_7.homework.hw_mod_5_update;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " was saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " was deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + "was updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(0, 0, 0, 0, 0, null, null);
        System.out.println(room.toString() + " found");
        return room;
    }
}
