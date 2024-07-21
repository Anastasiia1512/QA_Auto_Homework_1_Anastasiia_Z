public class Developer extends Employee {

    public Developer(String name, int age, int salary) {
        super(name, age, salary);
    }
@Override
public void performJob(){
    System.out.println(getName()+" is develop the programm");
}
@Override
public void describeRole(){
    System.out.println(getName() + " is a developer");
}
@Override
public void describeRole(String extraInfo){
    System.out.println(getName() + " is a developer"+ " wanna be a manager");
}
}
