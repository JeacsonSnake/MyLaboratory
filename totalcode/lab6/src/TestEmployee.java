public class TestEmployee {
    public static void main(String[] args) {
        Employee p1 = new Employee("Tom Daly","Teacher",45000,1);
        Employee p2 = new Employee("Mary Murphy","Developer",30000,2);
        Employee p3 = new Employee();
        System.out.println("Employee 2 is called "+p2.getName()+"who is a "+p2.getJobTitle());
        System.out.println("Their salary is "+p2.getSalary());
        System.out.println("Their Employee ID number is "+p2.getEmployeeID());
        p3.setSalary(10000);
        p1.showEmp();
        p2.showEmp();
        p3.showEmp();
        p1.toString();

        
    }
}
class Employee{
    private String name;
    private String jobTitle;
    private double salary;
    
    private int employeeID;
    public Employee(){
        name = "Michael Higgins";
        jobTitle = "President";
        salary =  19000.0;
        employeeID = 1003;
    }
    public Employee(String name,String jobTitle,float salary,int employeeID){
        this.name =name;
        this.jobTitle = jobTitle;
        this.salary =salary;
        this.employeeID = 1000+employeeID ;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        if (salary<19000.0)
        {
            System.out.println("Entered salary of "+salary+" is too low. Salary set at minimum wage of €19000.0");
        }
        else
            this.salary = salary;
    }
    public void showEmp(){
        System.out.println("EMPLOYEE RECORD");
        System.out.println("NAME: "+getName());
        System.out.print(" JOBTITLE: "+getJobTitle());
        System.out.println("CURRENT SALARY: "+getSalary());
        System.out.println("EMPLOYEE ID: "+getEmployeeID());
    }

    @Override
    public String toString() {
        String details = "NAME: "+getName();
        details += " JOBTITLE: "+getJobTitle();
        details += "\nCURRENT SALARY: "+getSalary();
        details += "\nEMPLOYEE ID: "+getEmployeeID();
        return details;
    }
}