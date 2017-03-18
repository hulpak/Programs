 public class Order {

//не розумію для чого треба використовувати зміну int day тому просто добавив в enum дні тижня з іхню назвою
    private Day days;

    private Customer customer;

      Order(Customer c,Day days){
        this.days = days;
        this.customer = c;
    }

    public Day getDays() {
        return days;
    }

    public void setDays(Day days) {
        this.days = days;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{\n" +
                "days=" + days +
                ", customer=" + customer +"\n"+
                '}';
    }

}
