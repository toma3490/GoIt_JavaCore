package module_10.homework.task_4;

public class TestClass {
    public void f (int number){
        try{
            if (g(number) < -100000){
                System.out.println("Your number = " + number);
                throw new ExceptionForBigNegNum("Your number less than -100000");
            }
        }catch (ExceptionForBigPosNum e){
            e.getMessage();
        }catch (ExceptionForBigNegNum e){
            e.getMessage();
        }
    }
    public int g (int number) throws ExceptionForBigPosNum{
        if (number >= 100000) {
            System.out.println("Your number = " + number);
            throw new ExceptionForBigPosNum("Your number bigger than 100000");
        }
        return number;
    }
}
