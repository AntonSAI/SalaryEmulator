package salaryemulator.data;

import org.springframework.stereotype.Component;
import salaryemulator.model.currency.Conversion;
import salaryemulator.model.currency.Currency;

import java.math.BigDecimal;

@Component
public class CurrencyExchangeRatesGenerator {
    public Conversion generateRateUSDBYN() {
        final double base = 2.0;
        double fraction = Math.random();

        return new Conversion(Currency.USD, Currency.BYN, BigDecimal.valueOf(base + fraction));
    }
}
