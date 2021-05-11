package statistics;

import org.assertj.core.api.AbstractAssert;

public class PlayerAssert extends AbstractAssert<PlayerAssert, Player> {

    public static PlayerAssert assertThat(Player player){
       return new PlayerAssert(player);
    }

    public PlayerAssert(Player player){
        super(player, PlayerAssert.class);
    }

    public PlayerAssert hasName(String expectedName){

        isNotNull();
        if(!actual.getName().equals(expectedName)){

            failWithMessage("Expected name: " + expectedName + ", but was: " + actual.getName());
        }

        return this;
    }
}
