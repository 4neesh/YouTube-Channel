public class ZooKeeper {

    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "ZooKeeper{" +
                "name='" + name + '\'' +
                '}';
    }
}
