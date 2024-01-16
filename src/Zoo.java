import org.w3c.dom.css.Counter;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Zoo {

    ArrayList<Animal> animals() {
        return null;
    }

    ArrayList<Animal> readFromFile(String fileName) throws IOException {

        ArrayList<Animal> animals = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        reader.readLine();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] lines = line.split(",");
            Animal animal = new Animal(lines[0], lines[1], Integer.parseInt(lines[2]), lines[3], lines[4]);
            animals.add(animal);
        }

        return animals;

    }

    void displayAnimals(ArrayList<Animal> animals) {
        animals.stream().map(Animal::getSpecies)
                .distinct()
                .sorted()
                .forEach(animal -> System.out.println(animal));
    }


    void saveAnimalsToFile(ArrayList<Animal> animals) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("sick_animals.txt"));

        animals.stream()
                .filter(animal -> animal.getHealth_status().equals("Sick"))
                .map(animal -> {
                    return animal.getName().toUpperCase();
                })
                .forEach(s -> {
                    try {
                        writer.write(s);
                        writer.write("\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

        writer.close();
    }

}
