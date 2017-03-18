import java.io.Serializable;

/**
 * Created by Valeriy on 18.03.2017.
 */
public class Fixed extends Employeer implements Serializable{

    private double fixedPaymend;

    public Fixed(int id,String name, String surname,double fixedPaymend) {
        super(id,name, surname);
        this.fixedPaymend = fixedPaymend;
    }

    public void setFixedPaymend(double fixedPaymend) {
        this.fixedPaymend = fixedPaymend;
    }

    @Override
    public  double getMonthlySalary(){
        return fixedPaymend;
    }

    @Override
    public String information() {
        return super.information()+" "+ getMonthlySalary();
    }
}
