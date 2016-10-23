package module_9.practice;

/**
 * Created by Toma on 19.10.2016.
 */
public class Duck implements Animal {
    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
