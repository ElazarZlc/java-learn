import java.util.Random;
class ChatterBot {

    static final String REQUEST_PREFIX = "say ";
    String[] repleisToIllegalRequest;
    Random random = new Random();

    ChatterBot(String[] repleisToIllegalRequest){
        this.repleisToIllegalRequest = repleisToIllegalRequest;
    }

    String replyTo(String statement){
        if(statement.startsWith(REQUEST_PREFIX)){
            return statement.replace(REQUEST_PREFIX, "");
        }
        return replyToIllegalRequest(statement);
    }
    String replyToIllegalRequest(String statement){
        String reply = repleisToIllegalRequest[random.nextInt(repleisToIllegalRequest.length)];
        if(random.nextBoolean()){
            reply = reply + statement;
        }
        return reply;
    }
}