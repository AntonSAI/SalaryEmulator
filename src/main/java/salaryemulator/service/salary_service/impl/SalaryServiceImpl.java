package salaryemulator.service.salary_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import salaryemulator.data.BonusCalculator;
import salaryemulator.data.PositionSalary;
import salaryemulator.model.currency.Currency;
import salaryemulator.model.employee.Employee;
import salaryemulator.model.position.PositionCategory;
import salaryemulator.model.salary.Salary;
import salaryemulator.service.currency_service.CurrencyExchangeService;
import salaryemulator.service.salary_service.SalaryRegulation;
import salaryemulator.service.salary_service.SalaryService;

import java.util.ArrayList;
import java.util.List;

@Component
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private CurrencyExchangeService currencyExchangeService;
    @Autowired
    private List<SalaryRegulation> salaryRegulations = new ArrayList<>();

    @Override
    public Salary calculateSalary(PositionCategory positionCode, Currency currency) {
        Salary salary = PositionSalary.SALARIES.get(positionCode);
        Salary result;
        if (salary.getAmount().getCurrency() == currency) {
            result = salary;
        } else {
            result = new Salary(currencyExchangeService.convert(salary.getAmount(), currency));
        }

        salaryRegulations.forEach(adj -> adj.regulationSalary(result));

        return result;
    }

    public CurrencyExchangeService getCurrencyExchangeService() {
        return currencyExchangeService;
    }

    public void setCurrencyExchangeService(CurrencyExchangeService currencyExchangeService) {
        this.currencyExchangeService = currencyExchangeService;
    }

    public List<SalaryRegulation> getSalaryRegulations() {
        return salaryRegulations;
    }

    public void setSalaryRegulations(List<SalaryRegulation> salaryRegulations) {
        this.salaryRegulations = salaryRegulations;
    }
}
