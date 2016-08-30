package module_3.homework.task_2;

public class Adder extends Arithmetic{
    boolean check(Integer a, Integer b){
        boolean flag = false;
        if(a >= b) flag = true;
        return flag;
    }
}
