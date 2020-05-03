package salaryemulator.model.currency;

import java.math.BigDecimal;
import java.util.Objects;

public class CurrencyAmount {
    private BigDecimal value;
    private Currency currency;


    public CurrencyAmount() {
    }

    public CurrencyAmount(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyAmount currencyAmount = (CurrencyAmount) o;
        return value.equals(currencyAmount.value) &&
                currency == currencyAmount.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }

    @Override
    public String toString() {
        return super.toString() + "-" + value.toString() + currency.name();
    }
}
