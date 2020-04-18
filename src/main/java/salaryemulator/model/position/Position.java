package salaryemulator.model.position;

public class Position {
    private int id;
    private PositionCategory category;

    public Position() {
    }

    public Position(int id, PositionCategory category) {
        this.id = id;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PositionCategory getCategory() {
        return category;
    }

    public void setCategory(PositionCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", category=" + category +
                '}';
    }
}
