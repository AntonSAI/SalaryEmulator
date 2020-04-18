package salaryemulator.service.currency_service;

import salaryemulator.model.currency.Currency;
import salaryemulator.model.currency.CurrencyAmount;

public interface CurrencyExchangeService {
    CurrencyAmount convert(CurrencyAmount currencyAmount, Currency currency);
}
