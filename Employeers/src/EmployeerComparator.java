import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Valeriy on 18.03.2017.
 */
public class EmployeerComparator implements Comparator<Employeer>,Serializable {

    @Override
    public int compare(Employeer e1, Employeer e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
