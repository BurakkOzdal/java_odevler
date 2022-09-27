package odevler.odev2.inheritance;

public class Inheritance {
    public static void main(String[] args){

        Customer customer=new Customer();
        customer.getFirstName();

        Employee employee=new Employee();
        employee.getFirstName();

        EmployeeManager employeeManager=new EmployeeManager();
        employeeManager.BestEmployee();
        employeeManager.Add();

        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
    }
}
