package HomeWorks;

public class Dancer extends Person{

    private String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void dancing() {
        System.out.println(getName()+" is dancing");
    }

    @Override
    public String toString() {
        return "Dancer information: " +'\n'+
                super.toString()+
                "groupName: " + groupName +'\n';
    }
}
