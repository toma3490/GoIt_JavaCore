package module_6.practice.task_2;

public class User {
    private static int nextCounter = 1;
    private int counter;

    public User() {
        setCounter();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter = nextCounter;
        nextCounter++;
    }
}
