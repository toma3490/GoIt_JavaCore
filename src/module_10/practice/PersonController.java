package module_10.practice;

import java.util.Map;

public class PersonController {
    private static PersonDAOImpl personDAO = new PersonDAOImpl();
    public String save(Map<String, String> requestParams) throws PersonException{
        if (!requestParams.containsKey("firstName")){
            throw new PersonException("Отсутствует обязательный параметр \"Имя\"");
        }
        if (!requestParams.containsKey("email")){
            throw new PersonException("Отсутствует обязательный параметр \"Email\"");
        }
        final String firstName = checkForNull(requestParams, "firstName");
        final String email = checkForNull(requestParams, "email");
        final String lastName = checkForNull(requestParams, "lastName");

        Person person = new Person(firstName, lastName, email);

        personDAO.save(person);
        return person.toString();

    }

    public String findByEmail(Map<String, String> requestParams) throws PersonException {
        if(!requestParams.containsKey("email")) {
            throw new PersonException("Отсутствует обязательный параметр \"Email\"");
        }
        final String email = requestParams.get("email");

        Person person = personDAO.findByEmail(email);
        if(person == null) {
            throw new PersonException("В базе нет персоны с таким email");
        }
        return person.toString();
    }

    private String checkForNull(Map<String, String> requestParams, String param){
        String res;
        if(requestParams.get(param) != null){
            res = requestParams.get(param);
        }else {
            res = "";
        }
        return  res;
    }
}
