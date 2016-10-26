package module_8.homework;

import java.util.List;

public interface UserDAO {
    User save (User user);
    void delete(User user);
    void deleteAll(List<User> users);
    void saveAll(List<User> users);
    List<User> getList();
    void deleteById(long id);
    User getById(long id);
}
