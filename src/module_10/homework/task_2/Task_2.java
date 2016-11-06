package module_10.homework.task_2;

public class Task_2 {
    public static void main(String[] args) {
        Task_2 task2 = new Task_2();
        try{
            task2.f();
        }catch (MyException e){
            System.out.println("Caught my own exception!");
        }
    }
    private void f() throws MyException{
        throw new MyException("Throw my own exception!");
    }
}
