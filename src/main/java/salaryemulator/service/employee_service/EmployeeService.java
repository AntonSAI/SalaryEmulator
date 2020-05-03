package salaryemulator.service.employee_service;

import salaryemulator.model.employee.Employee;
import salaryemulator.model.position.PositionCategory;

import java.util.List;

public interface EmployeeService {
    void hireEmployee(Employee employee);
    void fireEmployee(Employee employee);
    List<Employee> getCompanyStaff(PositionCategory category);
}
