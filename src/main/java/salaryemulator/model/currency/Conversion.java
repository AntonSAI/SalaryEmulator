package salaryemulator.model.currency;

import java.math.BigDecimal;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conversion that = (Conversion) o;
        return Objects.equals(initial, that.initial) &&
                Objects.equals(needed, that.needed) &&
                Objects.equals(rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initial, needed, rate);
    }

    @Override
    public String toString() {
        return initial.name() + needed.name() + ":" + rate.toPlainString();
    }
}
