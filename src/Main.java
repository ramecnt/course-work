public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("John Doe", 40000, 1);
        employees[1] = new Employee("Jane Doe", 80000, 2);
        employees[2] = new Employee("Jane Dae", 40000, 3);
        employees[3] = new Employee("American boy", 120000, 4);
        employees[4] = new Employee("Not like others", 40200, 5);
        employees[5] = new Employee("Travis Scott", 240000, 4);
        employees[6] = new Employee("Frank Ocean", 40002, 3);
        employees[7] = new Employee("Hans Zimmer", 401200, 2);
        employees[8] = new Employee("Frank Sinatra", 123123, 1);
        employees[9] = new Employee("Playboi Carti", 38465, 5);

        EmployeeBook employeeBook = new EmployeeBook(employees);

        DepartmentEmployees example = new DepartmentEmployees();

        example.departmentEmployeesMethods(employeeBook, 1, 'a', 15);
        example.departmentEmployeesMethods(employeeBook, 2, 'b', 20);
        example.departmentEmployeesMethods(employeeBook, 3, 'c', 25);
        example.departmentEmployeesMethods(employeeBook, 4, 'd', 30);
        example.departmentEmployeesMethods(employeeBook, 5, 'e', 35);
        example.departmentEmployeesMethods(employeeBook, 5, 'f', 40);

        Employee newEmployee = new Employee("Mark Doe", 100000, 5);
        employeeBook.deleteUser(2);
        employeeBook.addUser(newEmployee);
        System.out.println(employeeBook.getEmployee(11).toString());
    }
}