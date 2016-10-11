package module_8.practice;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil <T>{
    static <T extends Shape> List<T> deleteEmpty(List<T> list){
        List<T> res = new ArrayList<>();
        for (T shape : list) {
            if (shape != null) {
                res.add(shape);
            }
        }
        return res;
    }
}
