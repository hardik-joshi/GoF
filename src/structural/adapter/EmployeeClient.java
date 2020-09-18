package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        EmployeeDB employeeFromDB = new EmployeeDB("1234", "Hardik", "Joshi", "hardik@gmail.com");
        employees.add(employeeFromDB);

//        Will not work! This is where the adapter comes in play!
//        Employee employeeFromLdap = new EmployeeLdap("2345", "Charles", "White", "charles@gmail.com");
        EmployeeLdap employeeFromLdap = new EmployeeLdap("2345", "Charles", "White", "charles@gmail.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("3456,Sherlock,Holmes,sherlock@gmail.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
