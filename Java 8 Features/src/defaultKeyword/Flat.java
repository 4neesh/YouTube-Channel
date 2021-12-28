package defaultKeyword;

public class Flat implements Bedroom{

    private String bedroomId;

    public Flat(String bedroomId) {
        this.bedroomId = bedroomId;
    }

    @Override
    public boolean roomOccupied() {
        return false;
    }

    @Override
    public String getBedroomId() {
        return "Flat:" + this.bedroomId;
    }
}
