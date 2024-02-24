import java.time.LocalDateTime;

public class Producer {

    public static String POISON_PILL = "POISON";
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void publishMessage(String message){

        if(LocalDateTime.now().getHour() > 14){
            this.queue.publishMessage(POISON_PILL);
        }
        this.queue.publishMessage(message);
    }
}
