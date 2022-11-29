package Workshop2;
import java.util.Scanner;
public class EmpDetails {

    public String name, city, state, department;
    public int age, phoneNumber;

    public void Contacts(String name, String city, String state, String department, int age, int phoneNumber) {

        this.name = name;
        this.city = city;
        this.state = state;
        this.department = department;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "EmpDetails{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public EmpDetails getContactsInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Employee");
        String name = sc.nextLine();
        setName(name);
        System.out.println("Enter City Of Employee");
        String city = sc.nextLine();
        System.out.println(" Enter State of Employee ");
        String state = sc.nextLine();
        System.out.println("Enter department of Employee");
        String department = sc.nextLine();
        System.out.println("Enter Employee phone number");
        int phoneNumber = sc.nextInt();
        EmpDetails empDetails = new EmpDetails();
        return empDetails;

    }


    public static void main(String[]args) {

        EmpDetails empDetails = new EmpDetails();
        empDetails.getContactsInput();
        Scanner sc = new Scanner(System.in);
        String name = empDetails.getName();
        System.out.println("Employee Details Are:"+name);

    }




}
