package salaryemulator.model.position;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Position {
    private Long id;
    private PositionCategory category;

    public Position() {
    }

    public Position(Long id, PositionCategory category) {
        this.id = id;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PositionCategory getCategory() {
        return category;
    }

    public void setCategory(PositionCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return id.equals(position.id) &&
                category == position.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category);
    }

    @Override
    public String toString() {
        return "Position-" + id + "-" + category;
    }
}
