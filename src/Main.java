/**
 * Created by saianudeepm on 7/2/15.
 */
public class Main {
    
    public static void main(String args[]){

        Project project1 = new Project("project 1", 1200000);
        project1.display();
        
        Project project2 = new Project("project 2", 1400000);
        project2.display();
        
        Project project3 = new Project("project 3", 1800000);
        project3.display();
        
        Project[] projects = new Project[]{project1,project2,project3}; 
        
        Person person1 = new Programmer("programmer1", "java", 8000);
        person1.display();
        
        Person person2 = new Programmer("programmer2", "C++", 5000);
        person2.display();
        
        Manager manager1 = new Manager("Manager1", "Management", 10000);
        manager1.setAnnualBonus(10000);
        manager1.display();

        System.out.println("\n******Printing all group complete details*****\n");
        ITGroup itGroup = new ITGroup(projects,"Group 1");
        itGroup.setMembers(new Person[]{person1,person2,manager1});
        itGroup.display();
        
        
    }
}
