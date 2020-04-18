package salaryemulator.service.position_service;

import salaryemulator.model.position.Position;
import salaryemulator.model.position.PositionCategory;

import java.util.Optional;

public interface PositionService {
    Optional<Position> getPositionByCode(PositionCategory category);
    Position addPosition(Position position);
    void updatePosition(Position position, PositionCategory category);
    Position deletePosition(PositionCategory category);
}
