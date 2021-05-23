import static jdk.internal.dynalink.support.Guards.isNotNull;

public class Player {

    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Player p = (Player)obj;
        return p.getName() == this.getName();
    }

    public static PlayerAssert assertThat

    public Player hasName(String name){
        isNotNull();
        if (!actual.getName().equals(name)){
            failWithMessage("Expected name: " + actual.getName() + " but received " + name)
        }
        return this;
    }
}
