package salaryemulator.service.salary_service.impl;

import org.springframework.stereotype.Component;
import salaryemulator.model.salary.Salary;
import salaryemulator.service.salary_service.SalaryRegulation;

import java.math.BigDecimal;
import java.math.MathContext;


@Component
public class SalaryRegulationImpl implements SalaryRegulation {
    private static final int CURRENT_CURRENCY = 2;
    private static final BigDecimal INFLATION_RATE = new BigDecimal(0.04, new MathContext(CURRENT_CURRENCY));

    @Override
    public void regulationSalary(Salary salary) {
        BigDecimal regAmount = salary.getAmount().getValue().multiply(INFLATION_RATE.add(BigDecimal.ONE));
        salary.getAmount().setValue(regAmount);
    }
}
