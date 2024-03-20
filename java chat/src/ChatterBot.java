import java.util.Random;
class ChatterBot {

    static final String REQUEST_PREFIX = "say ";
    String[] repleisToIllegalRequest;
    Random random = new Random();

    ChatterBot(String[] repleisToIllegalRequest){
        this.repleisToIllegalRequest = new String[repleisToIllegalRequest.length];
        for(int i=0;i<repleisToIllegalRequest.length;i++){
            this.repleisToIllegalRequest[i] = repleisToIllegalRequest[i];
        }
    }

    String replyTo(String statement){
        if(statement.startsWith(REQUEST_PREFIX)){
            return statement.replaceFirst(REQUEST_PREFIX, "");
        }
        return replyToIllegalRequest(statement);
    }
    String replyToIllegalRequest(String statement){
        int randomIndex = random.nextInt(repleisToIllegalRequest.length);
        String reply = repleisToIllegalRequest[randomIndex];
        if(random.nextBoolean()){
            reply = reply + statement;
        }
        return reply;
    }
}