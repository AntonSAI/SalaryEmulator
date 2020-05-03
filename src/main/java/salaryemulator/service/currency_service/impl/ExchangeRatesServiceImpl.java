package salaryemulator.service.currency_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import salaryemulator.data.CurrencyExchangeRatesGenerator;
import salaryemulator.model.currency.Conversion;
import salaryemulator.model.currency.Currency;
import salaryemulator.service.currency_service.ExchangeRatesService;

@Component
public class ExchangeRatesServiceImpl implements ExchangeRatesService {
    @Autowired
    private CurrencyExchangeRatesGenerator exchangeRatesGenerator;

    @Override
    public Conversion getCurrentRate(Currency currency1, Currency currency2) {
        return exchangeRatesGenerator.generateRateUSDBYN();
    }

    public CurrencyExchangeRatesGenerator getExchangeRatesGenerator() {
        return exchangeRatesGenerator;
    }

    public void setExchangeRatesGenerator(CurrencyExchangeRatesGenerator exchangeRatesGenerator) {
        this.exchangeRatesGenerator = exchangeRatesGenerator;
    }
}
