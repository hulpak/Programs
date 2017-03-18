import java.io.Serializable;

/**
 * Created by Valeriy on 18.03.2017.
 */
public abstract class Employeer implements Serializable{
    private String name;
    private String surname;
    private int id;

    public Employeer(int id,String s,String n){
        this.id = id;
        this.name = n;
        this.surname = s;
    }

    public String information(){
        return ("Employeer " +id +" "+  name +"  "+ surname) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double getMonthlySalary();
}
