package salaryemulator.service.currency_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import salaryemulator.model.currency.Conversion;
import salaryemulator.model.currency.Currency;
import salaryemulator.model.currency.CurrencyAmount;
import salaryemulator.service.currency_service.CurrencyExchangeService;
import salaryemulator.service.currency_service.ExchangeRatesService;

import java.math.MathContext;

@Component
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
    private static final int PRECISION = 2;
    @Autowired
    private ExchangeRatesService exchangeRatesService;

    @Override
    public CurrencyAmount convert(CurrencyAmount currencyAmount, Currency currency) {
        Conversion conversion = exchangeRatesService.getCurrentRate(currencyAmount.getCurrency(), currency);
        CurrencyAmount result = new CurrencyAmount();
        result.setCurrency(currency);
        if (currencyAmount.getCurrency() == conversion.getInitial()) {
            result.setValue(currencyAmount.getValue().multiply(conversion.getRate(), new MathContext(PRECISION)));
        } else {
            result.setValue(currencyAmount.getValue().divide(conversion.getRate(), new MathContext(PRECISION)));
        }

        return result;
    }

    public ExchangeRatesService getExchangeRatesService() {
        return exchangeRatesService;
    }

    public void setExchangeRatesService(ExchangeRatesService exchangeRatesService) {
        this.exchangeRatesService = exchangeRatesService;
    }
}
