

/**
 *
 * @author INSTIKI
 */
public class EmployeeData {
    private int id;
    private String name;
    private String position;

    // Constructor
    public EmployeeData(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    // Setter methods for updating
    public void updateEmployeeData(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
    }

    // Method to delete employee data
    public void deleteEmployeeData() {
        this.name = null;
        this.position = null;
    }
}
    

