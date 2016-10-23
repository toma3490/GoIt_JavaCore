package module_9.practice;

import java.util.ArrayList;
import java.util.List;

public class DataModule {
    private List<Animal> animals = new ArrayList<>();

    public void add(Animal animal){
        animals.add(animal);
    }

    public void remove (Animal animal){
        animals.remove(animal);
    }
    
}
