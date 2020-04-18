package salaryemulator.data;

import salaryemulator.model.currency.Currency;
import salaryemulator.model.currency.CurrencyAmount;
import salaryemulator.model.position.PositionCategory;
import salaryemulator.model.salary.Salary;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PositionSalary {
    public static final Map<PositionCategory, Salary> SALARIES = new HashMap<>();

    static {
        SALARIES.put(PositionCategory.DEFAULT, new Salary(new CurrencyAmount(BigDecimal.valueOf(250.0), Currency.USD)));
        SALARIES.put(PositionCategory.FIRST_CATEGORY, new Salary(new CurrencyAmount(BigDecimal.valueOf(350.0), Currency.USD)));
        SALARIES.put(PositionCategory.SECOND_CATEGORY, new Salary(new CurrencyAmount(BigDecimal.valueOf(500.0), Currency.USD)));
        SALARIES.put(PositionCategory.THIRD_CATEGORY, new Salary(new CurrencyAmount(BigDecimal.valueOf(750.0), Currency.USD)));
    }
}
