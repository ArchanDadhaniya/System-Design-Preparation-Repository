package StructuralPatterns.ProxyPattern;


public class EmployeeDaoImplement implements EmployeeDao {

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        // create a new row with the employee details
        System.out.println("Created new row in employee table for employee: " + obj.getEmployeeName());
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        // delete a row
        System.out.println("Deleted row in employee table with employeeId: " + employeeId);
    }

    @Override
    public EmployeeDao get(String client, int employeeId) throws Exception {
        // fetch row
        System.out.println("Fetching data from the DB for employeeId: " + employeeId);
        return new EmployeeDaoImplement();
    }
}
