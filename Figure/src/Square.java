
public class Square extends  Figure{

    private int x;
    Square(String name, String color , int x) {
        super(name, color);
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    @Override
    public void draw(){
        System.out.println("I'm  " +super.getName()+ " of Color "+super.getColor()+ " area is "+getArea()+ " perimetr "+ getPerimetr());
    }
    @Override
    public double getArea(){
        return  Math.pow(getX(),2);
    }

    @Override
    public double getPerimetr() {
        return (getX()*4);
    }
}
