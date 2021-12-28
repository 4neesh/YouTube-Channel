package defaultKeyword;

public class Bungalow implements Bedroom{

    private String bedroomId;

    public Bungalow(String bedroomId) {
        this.bedroomId = bedroomId;
    }

    @Override
    public boolean roomOccupied() {
        return false;
    }

    @Override
    public String getBedroomId() {
        return "Bungalow:" + this.bedroomId;
    }
}
