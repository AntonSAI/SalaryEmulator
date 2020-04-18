package salaryemulator.service.salary_service;

import salaryemulator.model.currency.Currency;
import salaryemulator.model.position.PositionCategory;
import salaryemulator.model.salary.Salary;

public interface SalaryService {
    Salary calculateSalary(PositionCategory positionCode, Currency currency);
}
