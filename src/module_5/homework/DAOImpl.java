package module_5.homework;

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
        return null;
    }
}
