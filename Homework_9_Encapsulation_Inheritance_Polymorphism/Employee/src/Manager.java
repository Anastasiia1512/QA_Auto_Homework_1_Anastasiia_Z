public class Manager extends Employee {
    public Manager (String name, int age, int salary){
        super (name,age,salary);
    }
@Override
public void performJob(){
    System.out.println(getName()+ " is managing our team");
}
@Override
public void describeRole(){
    System.out.println(getName()+" is a manager");
}
@Override
public void describeRole(String extraInfo) {
    System.out.println(getName()+ " is a manager"+ " wanna be a sales manager");
}
}
