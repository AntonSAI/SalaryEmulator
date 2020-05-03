package salaryemulator.model.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import salaryemulator.model.position.PositionCategory;
import salaryemulator.model.salary.Salary;
import salaryemulator.model.position.Position;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Component
@Scope("prototype")
public class Employee {
    private static final Position DEFAULT_POSITION = new Position(0L, PositionCategory.DEFAULT);

    private String firstName;
    private String lastName;
    @Min(value = 18, message = "The age of employee must be greter than 18")
    @Max(value = 65, message = "The age of employee must be less than 65")
    private int age;
    private Position position;
    private Salary salary;
    private List<Skill> skills = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstName, String lastName, @Min(value = 18, message = "The age of employee must be greter than 18")
    @Max(value = 65, message = "The age of employee must be less than 65") int age, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ":" + position;
    }
}
