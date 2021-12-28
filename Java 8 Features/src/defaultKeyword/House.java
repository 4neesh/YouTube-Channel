package defaultKeyword;

public class House implements Bedroom, SwimmingPool{

    private String bedroomId;

    public House(String bedroomId) {
        this.bedroomId = bedroomId;
    }

    @Override
    public boolean roomOccupied() {
        return true;
    }

    @Override
    public String getBedroomId() {
        return "House:" + this.bedroomId;
    }

    @Override
    public void rentOut(String bedroomId) {
        //bedroom
        System.out.println("rent bedroom house");
        //swimming pool
        System.out.println("rent swimming pool house");
    }

}
