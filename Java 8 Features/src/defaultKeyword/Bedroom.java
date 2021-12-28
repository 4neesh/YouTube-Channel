package defaultKeyword;

public interface Bedroom {

    boolean roomOccupied();
    String getBedroomId();
    default void rentOut(String bedroomId){
        //connect database
        System.out.println("rent out bedroom");
        //pass in the bedroom id to sql

        //change room occupied boolean to true
    }
}
