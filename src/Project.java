/**
 * Created by saianudeepm on 7/2/15.
 */
public class Project implements Displayable{
    
    private String projectName;
    private double budget;
    
    
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Project(String projectName, double budget){
        
        this.projectName = projectName;
        this.budget = budget;
    }

    @Override
    public void display() {
        System.out.println("Project:"+projectName + " Budget:"+budget);
    }
}
