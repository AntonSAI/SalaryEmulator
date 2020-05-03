package salaryemulator.model.employee;

public enum Skill {
    SOME_SKILL(100), SOME_SKILL2(80), SOME_SKILL3(60), SOME_SKILL4(40);

    public double rating;

    Skill(int rating) {
        this.rating = rating;
    }
}
