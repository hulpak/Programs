/**
 * Created by Vasyl on 16.03.2017.
 */

public enum Day{
  monday("Monday"),
    tuesday("Tuesday"),
    wednesday("Wednesday"),
    thursday("Thursday"),
    friday("Friday"),
    saturday("Saturday"),
    sunday("Sunday");

  private String day;

   Day(String day){
      this.day = day;
  }

    public String getDay() {
        return day;
    }

}
