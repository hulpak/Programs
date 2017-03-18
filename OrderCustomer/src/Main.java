public class Main {

    public static void main(String[] args) {
        Customer c = new Customer("Vasyl","Chernivtsy,25","099022466");
    Order r = new Order(c,Day.friday);
        System.out.println(r.toString());
    }
}
