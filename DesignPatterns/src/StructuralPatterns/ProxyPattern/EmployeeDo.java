package StructuralPatterns.ProxyPattern;



// Placeholder class for EmployeeDo
public class EmployeeDo {

    // Assuming basic attributes like employeeId, name, etc.
    private int employeeId;
    private String employeeName;

    public EmployeeDo() {
        // Default constructor
    }

    public EmployeeDo(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
