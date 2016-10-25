package module_10.practice;

import java.util.HashMap;
import java.util.Map;


public class PersonRunner {
    public static void main(String[] args) {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("firstName", "Oleg"); // обязательный
        requestParams.put("lastName", "Orlov");
        requestParams.put("email", "mail@example.com"); // обязательный

        try {
            PersonController controller = new PersonController();
            String saveResult = controller.save(requestParams);
            System.out.println(saveResult);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
