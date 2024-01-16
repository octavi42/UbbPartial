public class Animal {

    private String name;
    private String species;
    private Integer age;
    private String enclosure_type;
    private String health_status;


    public Animal(String name, String species, Integer age, String enclosure_type, String health_status) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.enclosure_type = enclosure_type;
        this.health_status = health_status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEnclosure_type(String enclosure_type) {
        this.enclosure_type = enclosure_type;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Integer getAge() {
        return age;
    }

    public String getEnclosure_type() {
        return enclosure_type;
    }

    public String getHealth_status() {
        return health_status;
    }
}
