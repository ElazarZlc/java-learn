import java.util.Random;

class ChatterBot {

    static final String REQUEST_PREFIX = "Say ";
    static final String REQUEST_PHRASE_PLACEOLDER = "<phrase>";

    String[] repleisToIllegalRequest;
    String[] repleisToLegalRequest;
    Random random = new Random();
    String name;


    ChatterBot(String name, String[] repleisToLegalRequest, String[] repleisToIllegalRequest){
        this.name = name;
        this.repleisToLegalRequest = new String[repleisToLegalRequest.length];
       
        for(int i=0;i<repleisToLegalRequest.length;i++){
            this.repleisToLegalRequest[i] = repleisToLegalRequest[i];
        }
        this.repleisToIllegalRequest = new String[repleisToIllegalRequest.length];
       
        for(int i=0;i<repleisToIllegalRequest.length;i++){
            this.repleisToIllegalRequest[i] = repleisToIllegalRequest[i];
        }
    }

    String replyTo(String statement){
        if(statement.startsWith(REQUEST_PREFIX)){
            statement = statement.replaceFirst(REQUEST_PREFIX, "");
            return replyToAllRequest(statement, repleisToLegalRequest);
        }
        return replyToAllRequest(statement, repleisToIllegalRequest);
    }

  

    String replyToAllRequest(String statement, String[] repleis){
        int randomIndex = random.nextInt(repleis.length);
        return repleis[randomIndex].replaceAll(REQUEST_PHRASE_PLACEOLDER, statement);
    }
    String getName() {
        return this.name;
    }
}