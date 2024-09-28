public class Employee {
    public static int counter = 1;
    private final String fullName;
    private int salary;
    private int department;
    private final int id;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Имя: " + this.fullName + ", зарплата: " + this.salary + ", отдел: " + this.department;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Employee) {
            Employee otherEmployee = (Employee) other;
            return this.fullName.equals(otherEmployee.fullName);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.fullName.hashCode();
    }
}

