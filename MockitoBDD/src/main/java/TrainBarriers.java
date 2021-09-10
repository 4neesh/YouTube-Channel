import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainBarriers {

    private EmailService emailService;

    private Set<Integer> passengersOnBoard;

    public TrainBarriers(EmailService emailService) {
        this.passengersOnBoard = new HashSet<Integer>();
        this.emailService = emailService;
    }

    public void passengerEntry(int passengerId){
        if(passengerIsEligible(passengerId)) {
            passengersOnBoard.add(passengerId);
            emailService.notifyPassenger(passengerId);
        }
    }

    public Set<Integer> getPassengersOnBoard() {
        return passengersOnBoard;
    }

    public boolean passengerIsEligible(int passengerId) {
        //logic to check passenger can board train
        return !passengersOnBoard.contains(passengerId);
    }
}
