package stream;

public class Person {

    private Integer age;
    private String name;
    private String favouriteColour;

    public Person(String name, Integer age, String favouriteColour) {
        this.age = age;
        this.name = name;
        this.favouriteColour = favouriteColour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    public void setFavouriteColour(String favouriteColour) {
        this.favouriteColour = favouriteColour;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favouriteColour='" + favouriteColour + '\'' +
                '}';
    }
}
