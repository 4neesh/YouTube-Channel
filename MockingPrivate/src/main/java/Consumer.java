


public class Consumer {

    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    public boolean consume(){
        String m = this.queue.consumeNextMessage();
        if(m.equals(Producer.POISON_PILL)){
            gracefulShutdown();
        }
        try {
            sendMessageForProcessing();
            return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    private void gracefulShutdown() {
    }

    private void sendMessageForProcessing() {
        //logic to process message
    }
}
