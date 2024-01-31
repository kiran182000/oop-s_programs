public class Employee {
    String name;
    int salary;
    int id;
    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    void Yearsalary(){
        System.out.println("Yearly salary of employee is: " +salary*12);
    }
    void detail(){
        System.out.println("Name of Employee is: " +name);
        System.out.println("Salary of Employee is: " +salary);
    }
    public  static void main(String[] args){
        Employee E1=new Employee("Kiran",30000,18);
        E1.Yearsalary();
        E1.detail();
    }
}
