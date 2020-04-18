package salaryemulator.model.currency;

import java.math.BigDecimal;

public class Conversion {
    private Currency initial;
    private Currency needed;
    private BigDecimal rate;

    public Conversion() {
    }

    public Conversion(Currency initial, Currency needed, BigDecimal rate) {
        this.initial = initial;
        this.needed = needed;
        this.rate = rate;
    }

    public Currency getInitial() {
        return initial;
    }

    public void setInitial(Currency initial) {
        this.initial = initial;
    }

    public Currency getNeeded() {
        return needed;
    }

    public void setNeeded(Currency needed) {
        this.needed = needed;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "initial=" + initial +
                ", needed=" + needed +
                ", rate=" + rate +
                '}';
    }
}
