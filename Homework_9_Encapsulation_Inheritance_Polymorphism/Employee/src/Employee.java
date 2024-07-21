public class Employee {
    private String name;
    private int age;
    private int salary;

public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public int getSalary(){
    return salary;
}
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age = age;
}
public void setSalary(int salary) {
        this.salary = salary;
    }
public void work(){
    System.out.println(name + "is working");
}
public void takeBreak(){
    System.out.println(name + "take a break");
}
public void performJob(){
    System.out.println(name +"performing job");
}
public void describeRole(){
    System.out.println("Employee" +name);
}
public void describeRole(String extraInfo){
    System.out.println("Employee" + name + extraInfo);
}
}
