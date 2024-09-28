public class EmployeeBook {
    private final Employee[] employees;

    public Employee[] getEmployees() {
        return this.employees;
    }

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public void allEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public void allSalaries(Employee[] employees) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        System.out.println("Сумма зарплат: " + total);
    }

    public void lowestSalary(Employee[] employees) {
        int lowest = 1000000000;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < lowest) {
                    lowest = employee.getSalary();
                }
            }
        }
        System.out.println("Самая низкая зарплата: " + lowest);
    }

    public void highestSalary(Employee[] employees) {
        int highest = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > highest) {
                    highest = employee.getSalary();
                }
            }
        }
        System.out.println("Самая высокая зарплата: " + highest);
    }

    public void averageSalary(Employee[] employees) {
        int total = 0;
        int cnt = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
                cnt++;
            }
        }
        System.out.println("Средняя зарплата: " + (float) total / cnt);
    }

    public void allFullName(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexSalaries(Employee[] employees, float percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary((int) (employees[i].getSalary() * (1 + percent / 100)));
            }
        }
    }

    public void higherSalary(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println("Id: " + employee.getId() + ", имя: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

    public void lowerSalary(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println("Id: " + employee.getId() + ", имя: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

    public boolean addUser(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public void deleteUser(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public Employee getEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }
}
