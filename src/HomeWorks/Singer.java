package HomeWorks;

public class Singer extends Person{
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
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
    public void singing() {
        System.out.println(getName()+" is singing");
    }

    @Override
    public String toString() {
        return "Singer information: " +'\n'+
                super.toString()+
                "bandName: " + bandName + '\n';
    }
}
