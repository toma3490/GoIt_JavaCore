package module_10.practice;

import java.util.List;

public interface PersonDAO{
    Person save(Person person);
    Person findByEmail(String email);
    List<Person> get();
}
