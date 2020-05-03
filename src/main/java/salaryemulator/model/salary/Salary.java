package salaryemulator.model.salary;

import org.springframework.stereotype.Component;
import salaryemulator.model.currency.CurrencyAmount;
import salaryemulator.model.employee.Skill;

import java.util.List;
import java.util.Objects;

@Component
public class Salary {

    private CurrencyAmount amount;

    public Salary() {
    }

    public Salary(CurrencyAmount amount) {
        this.amount = amount;
    }

    public CurrencyAmount getAmount() {
        return amount;
    }

    public void setAmount(CurrencyAmount amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary = (Salary) o;
        return Objects.equals(amount, salary.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Salary-" + amount;
    }
}
