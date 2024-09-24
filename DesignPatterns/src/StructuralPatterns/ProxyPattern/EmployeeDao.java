package StructuralPatterns.ProxyPattern;

public interface EmployeeDao {

    public void create(String client, EmployeeDo obj) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public EmployeeDao get(String client, int employeeId) throws Exception;
}
