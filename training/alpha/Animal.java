package alpha;

public class Animal {

    private String breed;
    private Integer age;
    protected Double weight;
    protected Double height;

    public Animal(String breed, Integer age, Double weight, Double height) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Animal() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    protected Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    protected Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
