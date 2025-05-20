

/**
 *
 * @author margareta bunga kelore
 * TGL: 20 Mei 2025
 */
import java.util.Scanner;
public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager(10); // Max 10 employees

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee position: ");
                    String position = scanner.nextLine();
                    EmployeeData newEmployee = new EmployeeData(id, name, position);
                    manager.addEmployee(newEmployee);
                    break;

                case 2:
                    manager.displayAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter employee ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new position: ");
                    String newPosition = scanner.nextLine();
                    manager.updateEmployee(updateId, newName, newPosition);
                    break;

                case 4:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeEmployee(removeId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
