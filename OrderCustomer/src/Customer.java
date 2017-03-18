/**
 * Created by Vasyl on 16.03.2017.
 */
public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.setPhoneNumber(phoneNumber);
    }

    public Customer(){
        name="Unknown";
        address = "Unknown";
        phoneNumber="Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + getPhoneNumber()+
                '}';
    }
}
