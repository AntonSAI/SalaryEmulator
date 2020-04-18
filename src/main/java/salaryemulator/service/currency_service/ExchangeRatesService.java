package salaryemulator.service.currency_service;

import salaryemulator.model.currency.Conversion;
import salaryemulator.model.currency.Currency;

public interface ExchangeRatesService {
    Conversion getCurrentRate(Currency currency1, Currency currency2);
}
