package module_8.practice;

import java.util.*;

public class Group <T extends Shape> implements Iterable<T>{
    private List<T> shapes;

    public Group() {
        this.shapes = new ArrayList<>();
    }

    public T get(int index){
        return shapes.get(index);
    }

    public void add(T shape){
        this.shapes.add(shape);
    }

    public void addAll(Group<T> group){
//        version1
//        List<T> allShapesInGroup = group.getShapes();
//        shapes.addAll(allShapesInGroup);

//        version2
//        shapes.addAll(group.getShapes());
//        version main
        Iterator<T> iterator = group.iterator();
        while (iterator.hasNext()){
            T shape = iterator.next();
            add(shape);
        }
    }

    public void addAll(T[] arShapes){
        for (T shape : arShapes) {
            add(shape);
        }
    }

    public void remove(T shape){
        this.shapes.remove(shape);
    }

    public void removeAll(Group<T> shapes) {
        Iterator<T> inerator = shapes.iterator();
        while (inerator.hasNext()) {
            T shape = inerator.next();
            remove(shape);
        }
    }

    public void removeAll(T[] shapes) {
        for (T shape : shapes) {
            remove(shape);
        }
    }

    public int size() {
        return shapes.size();
    }

    public boolean isEmpty() {
        return shapes.isEmpty();
    }

    public void clear() {
        shapes.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return shapes.iterator();
    }

    @Override
    public String toString() {
        return shapes.toString();
    }

    public List<T> getShapes() {
        return shapes;
    }

    public T getMaxArea() {
        if (shapes.isEmpty()){
            return null;
        }

        shapes = ShapeUtil.deleteEmpty(shapes);
        T maxArea = shapes.get(0);
        for (T t : shapes) {
            if (t != null && t.getArea() > maxArea.getArea()) {
                maxArea = t;
            }
        }
        return maxArea;
    }

    public double getSumArea(){
        if (shapes.isEmpty()){
            return 0;
        }

        shapes = ShapeUtil.deleteEmpty(shapes);
        double sumArea = 0;
        for (T t : shapes) {
            sumArea += t.getArea();
        }
        return sumArea;
    }

}
