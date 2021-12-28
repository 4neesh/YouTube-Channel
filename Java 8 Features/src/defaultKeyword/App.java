package defaultKeyword;

public class App {

    public static void main(String[] args) {

        House house = new House("101");
        System.out.println(house.roomOccupied());
        System.out.println(house.getBedroomId());
        house.rentOut(house.getBedroomId());

        Bungalow bungalow = new Bungalow("102");
        System.out.println(bungalow.roomOccupied());
        System.out.println(bungalow.getBedroomId());

        Flat flat = new Flat("103");
        System.out.println(flat.roomOccupied());
        System.out.println(flat.getBedroomId());
        flat.rentOut(flat.getBedroomId());
    }
}
