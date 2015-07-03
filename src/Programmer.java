/**
 * Created by saianudeepm on 7/2/15.
 */
public class Programmer extends Person {
    
    private String skills;
    private double salary;

    public Programmer(String name,String skills,double salary) {
        super(name);
        this.skills= skills;
        this.salary=salary;
    }

    @Override
    public double getMonthlySalary() {
        return salary;
    }

    @Override
    public void display() {
        System.out.println("Name:" +this.getName() + " skills:"+skills);
    }

    @Override
    public void doWork() {
        System.out.println(this.getName()+" Doing work");
    }

    @Override
    public double getAnnualIncome() {
        return 12 * getMonthlySalary();
    }
}
