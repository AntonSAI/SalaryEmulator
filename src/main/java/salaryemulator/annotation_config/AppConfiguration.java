package salaryemulator.annotation_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import salaryemulator.data.Company;
import salaryemulator.model.currency.Conversion;
import salaryemulator.model.currency.CurrencyAmount;
import salaryemulator.model.employee.Employee;
import salaryemulator.model.position.Position;
import salaryemulator.model.salary.Salary;
import salaryemulator.service.currency_service.CurrencyExchangeService;
import salaryemulator.service.currency_service.ExchangeRatesService;
import salaryemulator.service.currency_service.impl.CurrencyExchangeServiceImpl;
import salaryemulator.service.currency_service.impl.ExchangeRatesServiceImpl;
import salaryemulator.service.employee_service.EmployeeService;
import salaryemulator.service.employee_service.impl.EmployeeServiceImpl;
import salaryemulator.service.position_service.PositionService;
import salaryemulator.service.position_service.impl.PositionServiceImpl;
import salaryemulator.service.salary_service.SalaryRegulation;
import salaryemulator.service.salary_service.SalaryService;
import salaryemulator.service.salary_service.impl.SalaryRegulationImpl;
import salaryemulator.service.salary_service.impl.SalaryServiceImpl;
import salaryemulator.util.PrinterFactory;

@Configuration
@ComponentScan("salaryemulator")
@PropertySource("classpath:company.properties")
public class AppConfiguration {

    @Bean
    public PrinterFactory printerFactory() {
        return new PrinterFactory();
    }

    @Bean
    public SalaryService salaryServiceImpl() {
        return new SalaryServiceImpl();
    }

    @Bean
    public SalaryRegulation salaryRegulationImpl() {
        return new SalaryRegulationImpl();
    }

    @Bean
    public PositionService positionServiceImpl() {
        return new PositionServiceImpl();
    }

    @Bean
    public EmployeeService employeeServiceImpl() {
        return new EmployeeServiceImpl();
    }

    @Bean
    public ExchangeRatesService exchangeRatesServiceImpl() {
        return new ExchangeRatesServiceImpl();
    }

    @Bean
    public CurrencyExchangeService currencyExchangeServiceImpl() {
        return new CurrencyExchangeServiceImpl();
    }

    @Bean
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public Salary salary() {
        return new Salary();
    }

    @Bean
    public Position position() {
        return new Position();
    }

    @Bean
    public Conversion conversion() {
        return new Conversion();
    }

    @Bean
    public CurrencyAmount currencyAmount() {
        return new CurrencyAmount();
    }

    @Bean
    public Company company() {
        return new Company();
    }
}
