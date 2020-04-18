package salaryemulator.model.employee;

import salaryemulator.model.salary.Salary;
import salaryemulator.model.position.Position;

public class Employee {
    private String firstName;
    private String lastName;
    private Position position;
    private Salary salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Position position, Salary salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
