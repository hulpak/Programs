import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Valeriy on 18.03.2017.
 */
public class EmployeerAverageCompare implements Comparator<Employeer>,Serializable {
    @Override
    public int compare(Employeer o1, Employeer o2) {
        if(o1.getMonthlySalary()<o2.getMonthlySalary())
            return 1;
        else if(o1.getMonthlySalary()>o2.getMonthlySalary())
            return -1;
        else
        return 0;
    }
}
