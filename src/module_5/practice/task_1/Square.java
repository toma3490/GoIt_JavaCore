package module_5.practice.task_1;

public final class Square extends View {

    int counter = 0;

    @Override
    public void show() {
        counter++;
        System.out.println("New square " + counter + " showing");
    }

    @Override
    public void hide() {
        if (counter <= 0){
            System.out.println("Sorry there is any square");
        }else{
            System.out.println("Square " + counter + " hided");
            counter--;
        }
    }
}
