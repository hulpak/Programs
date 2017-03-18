import java.io.Serializable;

/**
 * Created by Valeriy on 18.03.2017.
 */
public class Hourly extends Employeer implements Serializable{
    private double hourlyRate;

   public Hourly(int id,String name,String surname,double hourlyRate){
       super(id,name,surname);
       this.hourlyRate = hourlyRate*20.8*8;
   }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate*20.8*8;
    }

    @Override
    public double getMonthlySalary() {
        return hourlyRate;
    }

    @Override
    public String information() {
        return super.information()+" "+ getMonthlySalary();
    }
}
