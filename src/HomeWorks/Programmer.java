package HomeWorks;

public class Programmer extends Person {

    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public void coding() {
        System.out.println(getName()+" is coding");
    }

    @Override
    public String toString() {
        return "Programmer information: " +'\n'+
                super.toString()+
                "companyName: " + companyName + '\n';

    }
}
