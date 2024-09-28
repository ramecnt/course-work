public class DepartmentEmployees {
    public void departmentEmployeesMethods(EmployeeBook employees, int department, char command, float percent) {
        Employee[] departmentEmployees = new Employee[employees.getEmployees().length];
        int cnt = 0;
        for (Employee employee : employees.getEmployees()) {
            if (employee.getDepartment() == department) {
                departmentEmployees[cnt++] = employee;
            }
        }
        EmployeeBook newEmployee = new EmployeeBook(departmentEmployees);
        switch (command) {
            case 'a':
                newEmployee.lowestSalary(departmentEmployees);
                break;
            case 'b':
                newEmployee.highestSalary(departmentEmployees);
                break;
            case 'c':
                newEmployee.allSalaries(departmentEmployees);
                break;
            case 'd':
                newEmployee.averageSalary(departmentEmployees);
                break;
            case 'e':
                newEmployee.indexSalaries(departmentEmployees, percent);
                break;
            case 'f':
                for (Employee employee : newEmployee.getEmployees()) {
                    if (employee != null) {
                        System.out.println("Имя: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
                    }
                }
                break;
        }
    }
}
