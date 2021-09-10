public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Application{

    public static void main(String[] args) {

        Person a = new Person();
        a.setName("Andy");
        String andy = "Andy";
        boolean isNameAndy = andy.equals(a.getName());
        System.out.println(isNameAndy);

    }

}