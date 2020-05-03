package salaryemulator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import salaryemulator.data.BonusCalculator;
import salaryemulator.data.Company;
import salaryemulator.model.currency.Currency;
import salaryemulator.model.employee.Employee;
import salaryemulator.model.employee.Skill;
import salaryemulator.model.position.Position;
import salaryemulator.model.position.PositionCategory;
import salaryemulator.model.salary.Salary;
import salaryemulator.service.currency_service.CurrencyExchangeService;
import salaryemulator.service.currency_service.ExchangeRatesService;
import salaryemulator.service.employee_service.EmployeeService;
import salaryemulator.service.position_service.PositionService;
import salaryemulator.service.salary_service.SalaryService;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    private static final Logger LOG = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Company company = context.getBean("company", Company.class);
        BonusCalculator bonusCalculator = new BonusCalculator();
        LOG.info(" {} ", company.getName());

        CurrencyExchangeService currencyExchangeService = context.getBean(CurrencyExchangeService.class);
        ExchangeRatesService exchangeRatesService = context.getBean(ExchangeRatesService.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        PositionService positionService = context.getBean(PositionService.class);
        SalaryService salaryService = context.getBean(SalaryService.class);

        Position position0 = new Position(0L, PositionCategory.DEFAULT.DEFAULT);
        Position position1 = new Position(1L, PositionCategory.FIRST_CATEGORY);
        Position position2 = new Position(2L, PositionCategory.SECOND_CATEGORY);
        Position position3 = new Position(3L, PositionCategory.THIRD_CATEGORY);
        company.setPositions(Arrays.asList(position0, position1, position2, position3));

        Employee employee1 = new Employee("Emp1", "Surname1", 26, position1);
        Employee employee2 = new Employee("Emp2", "Surname2", 56, position1);
        Employee employee3 = new Employee("Emp3", "Surname3", 35, position2);
        Employee employee4 = new Employee("Emp4", "Surname4", 34, position2);
        Employee employee5 = new Employee("Emp5", "Surname5", 24, position3);
        Employee employee6 = new Employee("Emp6", "Surname6", 45, position3);


        employeeService.hireEmployee(employee1);
        employeeService.hireEmployee(employee3);
        employeeService.hireEmployee(employee6);

        int year = 2020;
        LOG.info("Year {}", year);
        for (int i = 0; i < 12; i++) {
            LOG.info("Month {}", i + 1);
            company.getPositions().forEach(position -> {
                Salary salary = salaryService.calculateSalary(position.getCategory(), Currency.BYN);
                employeeService.getCompanyStaff(position.getCategory())
                        .forEach(employee -> {
                            LOG.info("{} {} get salary {} {}",
                                    employee.getFirstName(),
                                    employee.getLastName(),
                                    salary.getAmount().getValue(),
                                    salary.getAmount().getCurrency().name());
                        });
            });
        }

        year++;
        employeeService.fireEmployee(employee1);
        employeeService.hireEmployee(employee2);
        employeeService.hireEmployee(employee5);
        LOG.info("Year {}", year);
        for (int i = 0; i < 12; i++) {
            LOG.info("Month {}", i + 1);
            company.getPositions().forEach(position -> {
                Salary salary = salaryService.calculateSalary(position.getCategory(), Currency.BYN);
                employeeService.getCompanyStaff(position.getCategory())
                        .forEach(employee -> {
                            LOG.info("{} {} get salary {} {}",
                                    employee.getFirstName(),
                                    employee.getLastName(),
                                    salary.getAmount().getValue(),
                                    salary.getAmount().getCurrency().name());
                        });
            });
        }
    }
}
