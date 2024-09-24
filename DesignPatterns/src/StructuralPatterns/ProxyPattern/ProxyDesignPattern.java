package StructuralPatterns.ProxyPattern;



public class ProxyDesignPattern {

    public static void main(String[] args) {

        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN", new EmployeeDo(1, "John Doe"));  // Fixed argument type
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
