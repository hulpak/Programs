
public class Triangle extends  Figure{

    private int a;
    private int b;
    private int c;

    Triangle(String name, String color,int a,int b,int c) {
        super(name, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
@Override
    public void draw(){
        System.out.println("I'm " +super.getName()+ " of Color "+super.getColor()+ " area is "+getArea()+ " perimetr "+ getPerimetr());
    }
@Override
    public double getArea(){
        int s = (getA()+getB()+getC())/2;
        return Math.sqrt(s*(s-getA())*(s-getB())*(s-getC()));
    }

    @Override
    public double getPerimetr() {
        return getA()+getB()+getC();
    }
}
