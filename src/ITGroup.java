import java.util.ArrayList;

/**
 * Created by saianudeepm on 7/2/15.
 */
public class ITGroup extends Group {

    protected Project[] projects;

    public ITGroup(Project[] projects, String groupName) {
        super(groupName);
        this.projects = projects;
    }

    public void setProjects(int pos, Project project) {
        this.projects[pos] = project;

    }

    public Project findLargestProject() {
        Project bigProject = null;
        for (Project project : projects) {
            if (bigProject == null)
                bigProject = project;
            else if (bigProject.getBudget() < project.getBudget()) {

                bigProject = project;
            }
        }
        return bigProject;
    }

    public Person[] findAllMembersMoreThan(double annualIncome) {
        
        ArrayList<Person> greaterMembers = new ArrayList<Person>() ;
        for(Person person:this.getMembers()){
            if(person.getAnnualIncome() > annualIncome)
                greaterMembers.add(person);
        }
        return (Person[])(greaterMembers.toArray());
    }

    public void askAllManagersDoWork() {
        for(Person person: this.getMembers()){
            if(person instanceof Manager){
                person.doWork();
                
            }
            
        }

    }

}
