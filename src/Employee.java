public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private final int id;
    static int counter = 1;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }


    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Ф.И.О. : " + fullName + " Отдел : " + department + " Зарплата: " + salary + " id=" + id + "]\n";

    }
}
