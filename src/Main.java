import java.io.IOException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {


//        design pattern used: Decorator

        Zoo zoo = new Zoo();
        ArrayList<Animal> animals = zoo.readFromFile("animals_inventory.csv");

//        DiseaseThread thread = new DiseaseThread(animals.get(0));
//        thread.stop();

        zoo.displayAnimals(animals);

    }
}