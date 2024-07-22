public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Mariia",25,20000),
                new Developer("Mark",30,10000),
                new Designer("Julia",45,15000),
        };
        for (Employee employee: employees){
            employee.performJob();
            employee.describeRole();
            employee.describeRole("extra info");
            System.out.println();
        }
    }
}