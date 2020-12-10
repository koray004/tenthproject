package scond;
public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
/**
 * Abstract factory, declares which chairs will be produced in the factory
 */