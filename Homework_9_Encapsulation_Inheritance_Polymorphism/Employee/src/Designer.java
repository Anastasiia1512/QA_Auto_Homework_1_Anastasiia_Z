public class Designer extends Employee{
    public Designer(String name, int age, int salary) {
        super(name, age, salary);
    }
@Override
public void performJob(){
    System.out.println(getName()+" is make the design of the program");
}
@Override
public void describeRole(){
    System.out.println(getName()+" is designer");
}
@Override
public void describeRole(String extraInfo){
    System.out.println(getName()+ " is designer"+ " wanna be a developer");
}
}


