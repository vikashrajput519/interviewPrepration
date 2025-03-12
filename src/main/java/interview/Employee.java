package interview;

public class Employee {

    public Employee(){
    }

    public Employee(String name, String mobileNumber, long salary, String city) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.city = city;
    }

    private String name;
    private String mobileNumber;
    private long salary;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
