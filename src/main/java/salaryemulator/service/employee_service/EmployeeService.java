package salaryemulator.service.employee_service;

import salaryemulator.model.employee.Employee;

import java.util.List;

public interface EmployeeService {
    void hireEmployee();
    void fireEmployee();
    List<Employee> getCompanyStaff();
}
