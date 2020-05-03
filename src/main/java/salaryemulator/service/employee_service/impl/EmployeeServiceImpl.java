package salaryemulator.service.employee_service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import salaryemulator.data.Company;
import salaryemulator.model.employee.Employee;
import salaryemulator.model.position.PositionCategory;
import salaryemulator.service.employee_service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger LOG = LogManager.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private Company company;

    public EmployeeServiceImpl() {
    }

    public EmployeeServiceImpl(Company company) {
        this.company = company;
    }

    @Override
    public void hireEmployee(Employee employee) {
        LOG.info("Employee {} {} hired", employee.getFirstName(), employee.getLastName());
        company.addEmployee(employee);
    }

    @Override
    public void fireEmployee(Employee employee) {
        LOG.info("Employee {} {} fired", employee.getFirstName(), employee.getLastName());
        company.removeEmployee(employee);
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public List<Employee> getCompanyStaff(PositionCategory category) {
        return company.getEmployees().stream()
                .filter(employee -> employee.getPosition().getCategory() == category)
                .collect(Collectors.toList());
    }
}
