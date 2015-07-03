/**
 * Created by saianudeepm on 7/2/15.
 */
public abstract class Person implements Displayable, Workable{
    
    private String name;
    
    //constructor
    public Person (String name){
        
        this.name=name;
    }
    public abstract double  getMonthlySalary();

    @Override
    public void display(){
        System.out.println("Name:" +getName() +"Annual salary:"+getAnnualIncome());
        
    }

    @Override
    public abstract void doWork();

    @Override
    public abstract double getAnnualIncome();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
