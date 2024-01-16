public class AnimalTakeCareDecorator implements IAnimalCareTake {

    protected IAnimalCareTake animalCareTake;

    public AnimalTakeCareDecorator(IAnimalCareTake animalCareTake)
    {
        this.animalCareTake = animalCareTake;
    }

    public void takeCare() {
        System.out.println("steal animal"); animalCareTake.takeCare(); }

}
