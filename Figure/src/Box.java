import java.util.ArrayList;
import java.util.Arrays;

public class Box {
public ArrayList<Figure> list;

    Box() {
        list = new ArrayList(Arrays.asList(
                new Circle("Circle", "red", 3),
                new Square("Square", "blue", 20),
                new Triangle("Triangle", "black", 5, 7, 6)
        )
        );
    }

    public void drawAll(){
            for(Figure f : list){
              f.draw();
            }
    }
    void add(Figure f){
        list.add(f);
    }
    }

