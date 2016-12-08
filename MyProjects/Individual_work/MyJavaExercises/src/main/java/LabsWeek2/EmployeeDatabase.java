package LabsWeek2;

/**
 *
 * @author apprentice
 */
public class EmployeeDatabase {
    
    private final String fullName;
    private final int employeeID;
    public String clearenceLevel;

    public EmployeeDatabase(String fullName, int employeeID, String clearenceLevel) {
        this.fullName = fullName;
        this.employeeID = employeeID;
        this.clearenceLevel = clearenceLevel;
    }
     
}