import java.util.ArrayList;

public interface PayAble {
public static  public static void main(String[] args){
    FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee(1,"Saleh",100);
    FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee(2,"Ali",50);
    PartTimeEmployee partTimeEmployee1=new PartTimeEmployee(1,"Khalid",8,100);
    PartTimeEmployee partTimeEmployee2=new PartTimeEmployee(2,"Noura",5,3);
    Company company=new Company("Tuwaiq");
    company.add(fullTimeEmployee1);
    company.add(fullTimeEmployee2);
    company.add(partTimeEmployee1);
    company.add(partTimeEmployee2);
    System.out.println(company);
    System.out.println(company.computeAmount());
}
   double computeAmount();
}
public abstract class Employee implements PayAble{
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    class FullTimeEmployee{
        private int weeklySalary;

        public FullTimeEmployee(int weeklySalary) {
            this.weeklySalary = weeklySalary;
        }

    }
    class PartTimeEmployee{
        private int workHours;
        private int wage;

        public PartTimeEmployee(int workHours, int wage) {
            this.workHours = workHours;
            this.wage = wage;
        }
    }

}
class company {
    private String name;
    private ArrayList<PayAble>;

    public company(String name) {
        this.name = name;
    }
    public boolean add(PayAble b){
        return true;
    }
    public double computeAmount{

    }

    @Override
    public String toString() {
        return "company{" +
                "name='" + name + '\'' +
                ", computeAmount=" + computeAmount +
                '}';
    }
}
