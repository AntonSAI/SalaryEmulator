package salaryemulator.service.position_service.impl;

import salaryemulator.data.Company;
import salaryemulator.model.position.Position;
import salaryemulator.model.position.PositionCategory;
import salaryemulator.service.position_service.PositionService;

import java.util.Iterator;
import java.util.Optional;

public class PositionServiceImpl  implements PositionService {
    private Company company;

    @Override
    public Position addPosition(Position position) {
        company.addPosition(position);
        return position;
    }

    @Override
    public void updatePosition(Position position, PositionCategory category) {
        company.getPositions().removeIf(p -> p.getCategory() == category);
        company.addPosition(position);
    }

    @Override
    public Position deletePosition(PositionCategory category) {
        Iterator<Position> posIterator = company.getPositions().iterator();
        Position removed = null;
        while (posIterator.hasNext()) {
            Position p = posIterator.next();
            if (p.getCategory() == category) {
                posIterator.remove();
                removed = p;
                break;
            }
        }

        return removed;
    }

    @Override
    public Optional<Position> getPositionByCode(PositionCategory category) {
        return company.getPositions()
                .stream()
                .filter(p -> p.getCategory() == category)
                .findFirst();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
