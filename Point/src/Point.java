
public class Point {
    private int x;
    private int y;

    public Point(){
        setPoint(0,0);
    }

    public Point(int x,int y){
        setPoint(x,y);
    }

    public void setPoint(int x,int y){
        this.x = x;
        this.y = y;
    }

    void movePoint(int a, int b){
        x = x + a;
        y = y + b;
    }

    public double getDistance(Point p){
        return Math.sqrt(Math.pow((x-p.x),2)+ Math.pow((y-p.y),2));
    }

    public double getDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.x-p2.x),2)+ Math.pow((p1.y-p2.y),2));
    }

    public boolean equalsPoint(Point p){
        return (this.x ==p.x && this.y == p.y)? true: false;
    }

    public String toString(){
        return "x-"+x +", y-"+y;
    }

    public void printDistance(){
        System.out.println(toString());
    }

    public int guadram(){
        if(x>0.0 && y>0.0) return 1;
        else
        if(x>0.0 && y<0.0) return 2;
        else
        if(x<0.0 && y<0.0) return 3;
        else
        if(x<0.0 && y>0.0) return 4;
        else return 0;
    }

}
