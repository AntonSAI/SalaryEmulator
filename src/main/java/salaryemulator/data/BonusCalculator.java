package salaryemulator.data;

import org.springframework.stereotype.Component;
import salaryemulator.model.employee.Skill;

import java.util.List;

@Component
public class BonusCalculator {
    private double calculate(List<Skill> skills) {
        double sum = 0;
        for (Skill skillEmployee:skills) {
            sum += skillEmployee.rating;
        }
        return sum;
    }

    public double getСoefficient(List<Skill> skills) {
        if (calculate(skills) <240) {
            return 0.30;
        } else if (calculate(skills) <200) {
            return 0.20;
        } else if (calculate(skills) <150) {
            return 0.10;
        } else return 0;
    }
}
