package salaryemulator.service.currency_service.impl;

import salaryemulator.data.CurrencyExchangeRatesGenerator;
import salaryemulator.model.currency.Conversion;
import salaryemulator.model.currency.Currency;
import salaryemulator.service.currency_service.ExchangeRatesService;

public class ExchangeRatesServiceImpl implements ExchangeRatesService {
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
