/**
 * Created by saianudeepm on 7/2/15.
 */
public class Manager extends Programmer {

    private double annualBonus;

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public Manager(String name,String skills,double salary) {
        super( name,skills, salary);
    }
    
    @Override
    public double getAnnualIncome(){
        return super.getAnnualIncome() + annualBonus;
        
    }
    
}
