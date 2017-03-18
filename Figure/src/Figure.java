import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

  abstract class Figure {

    private String name;
    private String color;

     Figure(String name,String color){
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("I'm Figure of Color incolor");
    }
    public abstract double getArea();
    public abstract double getPerimetr();
}
