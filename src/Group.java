/**
 * Created by saianudeepm on 7/2/15.
 */
public abstract class Group implements Displayable {

    private String groupName;

    public Person[] getMembers() {
        return members;
    }

    public void setMembers(Person[] members) {
        this.members = members;
    }

    protected Person[] members;

    private String groupName() {

        return this.groupName;
    }

    //constructor
    Group(String groupName) {
        this.groupName = groupName;

    }

    public void setMember(int pos, Person member){
        this.members[pos]=member;
    }

    @Override
    public void display() {
        System.out.println("Group Name:"+this.groupName + " \nMembers: ");
        
        for(Person person: getMembers()){
            person.display();
            
        }
    }
}
