package module_5.practice.task_2;

import module_5.practice.task_1.View;

import java.util.Arrays;

public class ViewHash {
    private int currentIndex = 0;
    private View[] views = new View[10];

    public void addView(View view){
        views[currentIndex] = view;
        currentIndex++;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        ViewHash viewHash = (ViewHash) object;

        if (currentIndex != viewHash.currentIndex) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(views, viewHash.views);

    }

    @Override
    public int hashCode() {
        int result = currentIndex;
        result = 31 * result + Arrays.hashCode(views);
        return result;
    }
}
