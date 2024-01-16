import static org.junit.jupiter.api.Assertions.*;

class AnimalTakeCareDecoratorTest {

    IAnimalCareTake takeCare = new AnimalTakeCare();
    IAnimalCareTake takeCare2
            = new AnimalTakeCareDecorator(new AnimalTakeCare());

}