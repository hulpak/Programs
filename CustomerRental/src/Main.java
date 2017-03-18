class Customer{
    private String name;

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    private Rental rental;
    public Customer(String name,Rental r) {
        this.name = name;
        this.rental = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
   return " name "+ getName()+ " amount " + getRental().amountFor()+
           " days " +getRental().getDays() + " price "+ getRental().getPrice();
    }
}

class Rental{
    private  Num kind;
    public final static int Week_Duration_days = 7;
    private int days;

    public Rental(Num kind, int days) {

        this.kind = kind;
        this.days = days;
    }
    public Num getKind() {
        return kind;
    }

    public void setKind(Num kind) {
        this.kind = kind;
    }


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }


    public double amountFor(){
    double result = days * getPrice()*kind.getD();

    return days > Week_Duration_days ? result * 3: result;
    }


    public double getPrice(){
        return 20.0;
    }
}

 public class Main {
     public static void main(String[] args) {
         Customer c = new Customer("Vasyl",new Rental(Num.first,8));
         System.out.println(c.toString());
     }
 }


