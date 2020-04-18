package salaryemulator.model.salary;

import salaryemulator.model.currency.CurrencyAmount;

public class Salary {
    private CurrencyAmount amount;

    public Salary() {
    }

    public Salary(CurrencyAmount amount) {
        this.amount = amount;
    }

    public CurrencyAmount getAmount() {
        return amount;
    }

    public void setAmount(CurrencyAmount amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                '}';
    }
}
