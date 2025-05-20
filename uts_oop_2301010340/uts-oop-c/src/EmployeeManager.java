

/**
 *
 * @author INSTIKI
 */
public class EmployeeManager {
    private EmployeeData[] employees;
    private int employeeCount;

    // Constructor
    public EmployeeManager(int size) {
        employees = new EmployeeData[size];
        employeeCount = 0;
    }

    // Add employee
    public void addEmployee(EmployeeData employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("No space to add more employees.");
        }
    }

    // Remove employee
    public void removeEmployee(int id) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId() == id) {
                employees[i].deleteEmployeeData();
                System.out.println("Employee with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // Update employee data
    public void updateEmployee(int id, String name, String position) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId() == id) {
                employees[i].updateEmployeeData(name, position);
                System.out.println("Employee with ID " + id + " has been updated.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // Display all employees
    public void displayAllEmployees() {
        if (employeeCount == 0) {
            System.out.println("No employees available.");
            return;
        }
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployeeData();
        }
    }

    // Get employee by ID
    public EmployeeData getEmployeeById(int id) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null; // Return null if not found
    }
    
}
