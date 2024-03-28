import java.util.Random;

class ChatterBot {

    static final String REQUEST_PREFIX = "Say ";
    static final String REQUEST_PHRASE_PLACEOLDER = "<phrase>";
    static final String ILLEGAL_REQUEST_PLACEHOLDER = "<reqoest>";
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
            return replyToLegalRequest(statement);
        }
        return replyToIllegalRequest(statement);
    }

    String replyToLegalRequest(String statement){
        String phrase = statement.replaceFirst(REQUEST_PREFIX, "");
        int randomIndex = random.nextInt(repleisToLegalRequest.length);
        return repleisToLegalRequest[randomIndex].replaceAll(REQUEST_PHRASE_PLACEOLDER, phrase);

    }

    String replyToIllegalRequest(String statement){
        int randomIndex = random.nextInt(repleisToIllegalRequest.length);
        return repleisToIllegalRequest[randomIndex].replaceAll(ILLEGAL_REQUEST_PLACEHOLDER, statement);
    }
    String getName() {
        return this.name;
    }
}