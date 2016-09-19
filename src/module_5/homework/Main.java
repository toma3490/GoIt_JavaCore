package module_5.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(3000, 3, "Ukraine", "Kiev");
        controller.requestRooms(3500, 2, "Khreschatyk", "Kiev");
        controller.requestRooms(2700, 1, "New", "Polyanutsya");

        Room[] rooms1 = controller.requestRooms(3000, 3, "Ukraine", "Kiev");
        System.out.println(Arrays.toString(rooms1));

        Room[] rooms2 = controller.requestRooms(3500, 2, "Khreschatyk", "Kiev");
        System.out.println(Arrays.toString(rooms2));

        Room[] rooms3 = controller.requestRooms(2700, 1, "New", "Polyanutsya");
        System.out.println(Arrays.toString(rooms3));

    }
}
