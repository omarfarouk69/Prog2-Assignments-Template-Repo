class Human {
    private String name;
    private int age;
    private String gender;

    Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    protected void printData(){
        System.out.println(" name is " + name);
        System.out.println(" gender is " + gender);
        System.out.println(" age is " + age);
    }
    final void greet(){
        System.out.println("Good");
    }
}

class Employee extends Human {
    private double salary;
    private String department;

    Employee(String name, int age, String gender, double salary, String department) {
        super(name, age, gender);
        this.salary = salary;
        this.department = department;
    }

    @Override
    protected void printData() {
        super.printData();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    double getSalary() {
        return salary;
    }

    String getDepartment() {
        return department;
    }
}

class BankAccount {
    private double balance;

    double getBalance(BankAccount obj){
        return this.balance + balance* 0.1;
    }
    void setBalance(Double balance){
        if(balance > 0 && balance<=1000000){
            this.balance += balance;
        }
    }
    void setBalance(Double balance , double tax){
        double Remaining = (balance - (balance*(tax/100)));
        this.balance += Remaining;
    }
}

class Customer extends Human {
    private String ssn;
    private String address;

    Customer(String name, int age, String gender, String ssn, String address) {
        super(name, age, gender);
        this.ssn = ssn;
        this.address = address;

    }
}
public class assign_5{
    public static void main(String[] args) {
        Employee obj = new Employee("Kareem amr hassen", 20, "Male", 200000.0, "IT");
        Customer obj2 = new Customer("Salma Amr hassen", 22, "Female", "123456789", "Giza ElOmrania");
        // System.out.println(obj.getSalary());
        // System.out.println(obj.getDepartment());
        BankAccount obj5 = new BankAccount();
        obj5.setBalance(1000.00 , 10);
        System.out.println(obj5.getBalance(obj5));
    }
}
