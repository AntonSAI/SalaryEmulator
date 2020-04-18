package salaryemulator.model.currency;

import java.math.BigDecimal;

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
    public String toString() {
        return "CurrencyAmount{" +
                "value=" + value +
                ", currency=" + currency +
                '}';
    }
}
