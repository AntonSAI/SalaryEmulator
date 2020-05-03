package salaryemulator.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import salaryemulator.model.employee.Employee;
import salaryemulator.model.position.Position;
import salaryemulator.util.Printer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class Company {
    @Value("${company.name}")
    private String name;
    private Printer printer;
    private List<Employee> employees = new ArrayList<Employee>();
    private List<Position> positions = new ArrayList<Position>();

    public Company() {
    }

    public Company(String name, List<Employee> employees, List<Position> positions) {
        this.name = name;
        this.employees = employees;
        this.positions = positions;
    }

    @PostConstruct
    public void myPostConstruct() {
        System.out.println("Company: myPostConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Company: preDestroy()");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public void removePosition(Position position) {
        positions.remove(position);
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printCompanyTagline() {
        getPrinter().printCompanyInfo();
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", positions=" + positions +
                '}';
    }
}
