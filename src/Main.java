/**
 * Created by saianudeepm on 7/2/15.
 */
public class Main {
    
    public static void main(String args[]){
        int numProjects=1;
        Project[] projects = new Project[numProjects];
        Project project1 = new Project("project 1", 123456);
        projects[0]= project1;
        ITGroup itGroup = new ITGroup(projects,"Group 1");
    }
}
