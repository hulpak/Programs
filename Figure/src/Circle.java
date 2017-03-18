
public class Circle extends Figure {

private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String name, String color, double radius){
        super(name,color);
        this.radius = radius;

    }
    @Override
     public void draw(){
        System.out.println("I'm  " + super.getName()+ " of Color "+super.getColor()+ " area is "+getArea()+ " perimetr "+ getPerimetr());
    }
    @Override
    public double getArea(){
    return Math.PI * Math.pow(getRadius(),2);
    }

   @Override
   public  double getPerimetr() {
        return 2*Math.PI*getRadius();
    }


}
