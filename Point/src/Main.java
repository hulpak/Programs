public class Main {

    public static void main(String[] args) {
       Point p = new Point(2,4);
       p.movePoint(2,5);
       System.out.println(p.equalsPoint(new Point(4,9)));
       p.printDistance();
        System.out.println(p.getDistance(new Point(4,7)));

    }
}
