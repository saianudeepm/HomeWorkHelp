/**
 * Created by saianudeepm on 7/2/15.
 */
public class Main {
    
    public static void main(String args[]){

        Project project1 = new Project("project 1", 1200000);
        Project project2 = new Project("project 2", 1400000);
        Project project3 = new Project("project 3", 1800000);
        Project[] projects = new Project[]{project1,project2,project3}; 
        
        Person person1 = new Programmer("programmer1", "java skill", 8000);
        Person person2 = new Programmer("programmer2", "C++ skill", 5000);
        Manager manager1 = new Manager("Manager1", "Management skill", 10000);
        manager1.setAnnualBonus(10000);
        
        ITGroup itGroup = new ITGroup(projects,"Group 1");
        itGroup.setMembers(new Person[]{person1,person2,manager1});
        
        itGroup.display();
        
        
    }
}
